# Data Wrangling

## Data Wrangling Tools that Tidyverse Provides
1. To install and use tidyverse: 
```R

install.packages(tidyverse)
library(tiddyverse)
```
2. arrange: arrange the rows in a particular order
    - sort gapminder by year
```R

gapminder %>% arrange(year, continent)
gapminder%>% arrange(year, -gdpPercap)  # (-) means sort from largest to smallest
```
3. mutate: compute a new column
```R

gapminder %>% mutate(gdp = gdpPercap * pop)
```
4. summarise: create a new data frame that contains certain characters from the original data frame. In the parameter the name of the columns is specified

5. filter: find a specific row and its containing data
```R

gapminder %>% group_by(year) %>% filter(gdpPercap == max(gdpPercap)) %>% arrange(year)  #find the max gdp for each year
```
6. distinct: make so that there are no duplicates
```R

df <- data.frame(a = c(1, 1, 2), b= c(1, 1, 2), c = c(2, 2, 2))
df %>% distinct()   # only output a and c because b is a duplicate of b

babynames %>% ddinstinct(name, sex) # select distinct names for different sex
```
7. Want to find the highest life expectancy for each couintry in gapminder
```R

gapminder %>% group_by(country) %>% summarise(max_lifeExp = max(lifeExp))
```
8. What is the increase in life expectancy for each of the countries? 
```R

increase <- function(x){

    max(x) - min(x)
}

gapminder %>%group_by(country) %>% summarise(maxLifeExp = increase(lifeExp))
```
9. The share off world GDDP for each country for each year
```R

gapminder %>% group_by(year) %>% mutate(gdp_share = ((gdpPercap * pop) / sum(gdpPercap * pop)))
```
## Tracing of Data Wrangling
1. Tracing the max life expectancy example at the end of the last section:
```R

gapminder %>% group_by(country) # mark all the columns by countries and process the data group by group (country by country)
gapminder %>% group_by(country) %>% 
                                summarise(max_lifeExp = max(lifeExp))   # creating a new data frame
# trace: 
# df <- data.frame(country = c("USA", "Canada", "...")), maxLifeExp = c(max(c(72.0, 76.4, ...)),max(c(70.0,75.0, ...),max(c(..., ...))))
```
2. Tracing max change in life expectancy example:
```R

gapminder %>% group_by(country) %>% 
                                summarise(max_lifeExp = increase(lifeExp))   # creating a new data frame
# trace: 
# df <- data.frame(country = c("USA", "Canada", "...")), maxLifeExp = c(max(c(72.0, 76.4, ...)- min(c(72.0, 76.4, ...),max(c(70.0,75.0, ...)) - min(c(70.0,75.0, ...)), max(c(..., ...)) - min(c(..., ...))))
```

## Practice
1. compute the number of countries in gapminder 
```R
gapminder %>% distinct(country) %>% dim[1]
```
2. write a function that compute the number of countries in a gapminder-life dataset
```R
numOfCountries <- function(df){

    df %>% distinct(country) %>% dim[1]
}
```
3. find the country with the largest life expectancy in the year 1982
```R
gapminder %>% filter(year == 1982) %>% arrange(-lifeExp)[1, "country"]

gapminder %>% filter(year==1982) %>% filter(lifeExp == max(lifeExp)) %>% select(country)
```
4. write a function that finds the largest life expentancy in a given year
```R
country_longest_life <- function(gapminder, y){
  (gapminder %>% filter(year == y) %>% 
     arrange(-lifeExp) )[1, "country"]

}
```