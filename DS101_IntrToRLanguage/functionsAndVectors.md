# Functions

## Algebraic approach to understanding functions in programming
1.syntax: the rules according to whcihsentences are constructed in language
e.g the R way to express f(x) =x^2 + 1
```R
f <- function(x){   #define the function

    x**2 + 1 #body of a function
}
```
e.g quadratic equation 
```R
sq.roots <- function(a, b, c){

    disc <- b**2 - 2*a*c    #notice disc cannot be access outside of the function because disc is defined from a, b, c that is subject to change 
    if(disc > 0){
        

        r1 <- (-b-sqrt(disc))/(2*a)
        r2 <- (-b+sqrt(disc))/(2*a)
        c(r1, r2)
    }else if(disc == 0){

        r <- (-b)/(2*a)
        r
    }else{

        c() # an empty vector -> null
    }
}
```
2. the algrbric approach: substituting the computation one step at a time -> function stepping
```R
sq.roots(1,2,1)
##########################################
sq.roots <- function(1, 2, 1){

    disc <- 2**2 - 2*1*1
    if(disc > 0){

        r1 <- (-2-sqrt(disc))/(2*1)
        r2 <- (-2+sqrt(disc))/(2*1)
        c(r1, r2)
    }else if(disc == 0){

        r <- (-2)/(2*1)
        r
    }else{

        c() # an empty vector -> null
    }
}
##########################################
sq.roots <- function(1, 2, 1){

    disc <- 0
    if(0 > 0){

        r1 <- (-2-sqrt(0))/(2*1)
        r2 <- (-2+sqrt(0))/(2*1)
        c(r1, r2)
    }else if(0 == 0){

        r <- -1
        r
    }else{

        c() # an empty vector -> null
    }
}
##########################################
sq.roots <- function(1, 2, 1){

    disc <- 0
    if(FALSE){  #notice that 0>0 is also a formula to be evaluated as false

        r1 <- -1
        r2 <- -1
        c(-1,-1)
    }else if(TRUE){

        r <- -1
        -1
    }else{

        c() # an empty vector -> null
    }
}
##########################################
-1
```

## Delayed Evaluation (very basic understanding)
1. eager evaluation: aka. call-by-value. A technique where an expression is evaluated as sson as it is bound to a variable or passed as an argument. The computation isperformed upfront and stored in memeory. 
2. delayed evaluation: compute whatever you can when you needed the value to avoid finding unnecessary values. This indicate that the computation is deferred until the last possible moment, and the result is cached for future use. 
e.g
```R
f <- function(x){

    cat("f")
    x+1
}

g <- function(x){

    cat("g")
    x*2
}

if(f(3)>4){

    g(5)
}else{

    g(6)
}
```
In a delayed language, the function is not evaluated untill compared to 4, and g(5), g(6) is not evaluated until if condition is resolved. In eager language, f(3) is evaluated as soon as encountered, g(5) and g(6) are evaluated before the if condition is checked.

## Computing Values vs. Printing to the Screen
1. cat() will print the content inside of the brackets
2. cat stands for concatinate
```R
emoState <- function(x){

    if(x >= 98){
        "Good"
    }else if(x >= 60){
        "Sane"
    }else{
        "Insane"
    }

    emoState(98) #this will not output anything because this is euquivalent to typing "Good" in the console
    cat(emoState(98)) #this will output Good 
}
```

## Function Design Receipe
1. Write the function header
    Name, inputs
2. Write down the type of the input and the output
    Number? character? Data frame?
3. Write down what the function does in English
4. Write down sample inputs and outputs
5. WRITE THE FUNCTION
6. Test the function
7. Practice
    - write a function that computes the second smallest element of a vector
```R

secondSmallest <- function(vec){

    sort(vec)[2]
}
```
    - write a function that computes the second largest element of a vector
```R

secondLargest <- function(vec){

    sort(vec)[length(v) - 1]
}
```
    - Write a function that takes in a data frame with a column “temperature (Celsius)” and a column “city”, and computes a new data frame with a new column “temperature (Fahrenheit)
```R

CelsiusToFahrenheit <- function(cityTemp){

    cityTemp %>% mutate(Ftemp = Ctemp * (9/5) + 32)
}
```
    - Write a function that takes in a data frame as in the previous problem and computes the second-smallest temperature in the data frame
```R

secondSmallest <- function(vec){

    sort(vec)[2]
}
secondLowestTemp <- function(cityTemp){

    secondSmallest(Ctemps$Celsius)
}

# or

secondLowestTemp2 <- function(cityTemp){

    (Ctemps %>% arrange(Celsius))[2, "Celsius"]
}

```
    - Write a function that takes in a data frame as in the previous problem and computes the average temperature for each city
```R

avgTemp <- function(cityTemp){

    Ctemps %>% group_by(city) %>% summarise(mean_temp = mean(Celsius))
}
```
    - Write a function tha takes in a data frame as in the previous problem and computes the city where the coldest day was recorded
```R

coldestDay <- function(cityTemp){

    (cityTemp %>% arrange(Celsius))[1, "city"]
}
```
    - Make a new data frame which contains the increase in life expectancy per year for each country in gapminder. The increase per year is the difference between the life expectancy in the last year and the first year, divided by the number of years.
```R

lifeExpLatestYear <- function(gapminder){

    (gapminder %>% arrange(-year))[1, "lifeExp"]
}

firstEle <- function(col){

    col[1]
}

LastEle <- function(col){

    col[length(col)]
}

gapminder %>% group_by(country) %>% arrange(-year) %>% smmarise(latestLifeExp = firstEle(lifeExp), 
                                                                earliestLifeExp = lastEle(lifeExp),
                                                                earliestYear = min(year), 
                                                                latestYear = max(year))             %>% mutate((latestLifeExp - earistLifeExp) / (latestYear - earliestYear))
```


# Vectors

## Introduction
1. a vector is an order collection of elements of the same type
e.g 
```R
v <- c(TRUE, FALSE, FALSE, TRUE)
```
2. you can access the elements using index
e.g 
```R
v <- c(TRUE, FALSE, FALSE, TRUE)
v[1] # this will output true
```
3. there are functions related to the vectors
```R
v <- c(2, -50, 2, 4)
sortedV <- sort(v)  #this will create sortedV as (-50, 2, 2, 4), notice the original vector v is not changed
length(v)           #this will output 4
unique(v)           #this will output (2, -50, 4) 
max(v)              #this will output 4
min(v)              #this will output -50
```
the max function can also be recreated as follows
```R  
    myMax <- function(x){

        sort(v)[length(v)]
    }   
```
4. Merge vectors
```R
v <- (5, 3)
v <- (1, v) #notice this create a new vector (1, 5, 3) and substitute back to the original v
```
## Logical Operators and Application in Vectors
1. &, |, !are logical operators
    - &: TRUE & TRUE == TRUE; TRUE & FALSE == FALSE; FALSE & FALSE == FLASE
    - |: TRUE | TRUE == TRUE; TRUE | FALSE == TRUE; FALSE | FALSE == FLASE
        - the "or" here is an "inclusive or", meaning when both conditions are true, the expression is true. This is not the case in daily english, which is "exclusive or", or "xor" which is "!=" 
    - !: !TRUE == FALSE
2. using logical operators in vectors
```R
v <- c(5, 2, -1, 1)
v>0 # this output a new vector (TRUE, TRUE, FALSE, TRUE)
v[v>0]  # this output a new vector (5, 2, 1)
v[v>0 & v<3]    #this will output a new vector (2, 1)
```
