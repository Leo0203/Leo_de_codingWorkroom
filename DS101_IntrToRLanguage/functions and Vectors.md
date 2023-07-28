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

    disc <- b**2 - 2*a*c
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

## Delayed Evaluation (verybasic understanding)
1. eager evaluation: compute whatever you can as fast as you can
2. delayed evaluation: compute whatever you can when you needed the value to avoid finding unnecessary values

## Cat
1. cat() will print the content inside of the brackets
2. cat stands for concatinate
```R
emoState <- function(x){

    if(x >= 98){
        "Good"
    }else if(x >= 60){
        "Sane"
    }else{
        "insane"
    }

    emoState(98) #this will not output anything because this is euquivalent to typing "Good" in the console
    cat(emoState(98)) #this will output Good 
}
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
    - the max function can also be recreated as follows
```R  
    myMax <- function(x){

        sort(v)[length(v)]
    }   
```
## Logical Operators and Application in Vectors
1. &, |, !are logical operators
    - &: TRUE & TRUE == TRUE; TRUE & FALSE == FALSE; FALSE & FALSE == FLASE
    - |: TRUE & TRUE == TRUE; TRUE & FALSE == TRUE; FALSE & FALSE == FLASE
    - !: !TRUE == FALSE
2. using logical operators in vectors
```R
v <- c(5, 2, -1, 1)
v>0 # this output a new vector (TRUE, TRUE, FALSE, TRUE)
v[v>0]  # this output a new vector (5, 2, 1)
v[v>0 & v<3]    #this will output a new vector (2, 1)
```
