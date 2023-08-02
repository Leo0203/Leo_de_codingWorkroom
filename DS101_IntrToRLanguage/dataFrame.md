# Data Frames(Tibbles)

## Introduction
1. Data frames are generic data objects of R that are used to store tabular data. Data frames can also be interpreted as matrices where each column of a matrix can be of different data types.
2. To define a data frame: 
```R

offer <- data.frame(amount = c(241, 590, 533), 
                    spec = c("family", "cardio", "ortho"))
```
    - the two vectors are columns of the table
    - the alignment of the vectors does not matter, but alignment can help the coder to understand the code better 

3. To view the data frame in a sheet
```R

View(offers)
```
    - the view function can present a sheet consist of the data frames, which you can sort the columns 
4. To extract values from the data frame
```R

babynames[2, ]
babynames[2, "names"]
babynames[1:3, ]
babynames[1:3, c("names", "year")]
```
    - this view the second row of the data frame. Sometimes the rows or columns have names, and thus the name is used instead of the number of rows or columns. Notice this method will return another data frame. One can also input a vector to extract several rows 
```R

babynames$prop
```
    - this present the data in prop in a single vector rather than a data frame.

5. practice: 
    - what is the most popular name in 1999
```R

babies1999 <- babynames[babynames$year == 1999, ]   # this will get the baby names in 1999; babynames$year == 1999 will return a vector of true and false, and the rows that are true will be outputed

maxNameCount <- max(babies1999$n)   

(babies1999$names)[maxNameCount == babies1999$n]    # maxNameCount == babies1999$n will return a vector of true and false, the true correspond to the location where the n = maxcount. The same location in babies1999$names will be the name that has the highest count

```
    - what is the most popular female name in 1999 
```R

fbabies1999 <- babynames[babynames$year == 1999 & babynames$sex == "F", ] 
maxFNameCount <- max(fbabies1999$n)   

(fbabies1999$names)[maxFNameCount == fbabies1999$n]
```
    - Write a function that find the most popular names in specified sex and year
```R
mostCommonName <- function(babynames, sex, year){

    babies <- babynames[babynames$year == year & babynames$sex == sex, ] 
    maxNameCount <- max(babies$n)   

    (babies$names)[maxFNameCount == babies$n]

}

```

## Wrangling Data Frames

### Composition of Functions
1. when a function's output is used as input for another function
```R
f <- function(x){

    x**@
}

g <- function(y){

    y + 2
}

f(g(5)) #[1] 49

library(tidyverse)
5 %>% g() %>% f()   # this is the same as f(g(5)): start with 5 -> transform with g to get g(5) -> transform with f to get f(g(5))
```
    - %>% is called pipe. Pipe can pass the preceding value into the function behind the pipe
### Wrangling Data Frames
2. filter: produce a dataframe from the specified columns
```R

filter(babynames, year == 1880, sex == "F")
babynames %>% filter(year == 1880, sex == "F")
babynames %>% filter(year == 1880) %>% filter(sex == "F")   # all three will be the same: to produce a dataframe that consists of rows of babynames where the value in column year is 1880 and sex is "F"
```

3. select: works similar to filter but is for columns 
```R

babynames %>% select(year, name) # create a dataframe like babynames, but with just the columns year and name
```

4. summarize: compute some function of a column
```R
babynames %>% summarize(pername = mean(n))  # create a new data frame that contains the mean of n

mean(babynames$n)   # this will output the same result
```
    - want the average count for sex == "M" and for sex == "F"
```R
babynames %>% filter(sex == "F") %>% summarize(pername = mean(n))
babynames %>% filter(sex == "M") %>% summarize(pername = mean(n))
```
    - group rows
```R
babynames %>% group_by(sex) %>% summarize(pername == mean(n))   # group by will separate the data frame by sex and then compute the mean for n for each group
```

5. practice: 
    - In gapminder, write code to compute the number of countries in Asia. 
        - Plan: get a dataframe with just Asian countries for just 1992, and compute the number of rows there
```R

(gapminder %>% filter(continent == "Asia", year == 1992) %>% dim)[1]    # 33
```
    - Write a function that takes in the name of the continent, and computes the numnber of countries on that continent
```R

numOfCountries <- function(gapminder, continentInput){

    (gapminder %>% filter(continent == continentInput, year == 1992) %>% dim)[1]
}
```