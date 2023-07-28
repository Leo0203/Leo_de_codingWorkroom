# Goal of The Course
1. Intro to computational thinking
2. Intro to data science
    - focusing on tabular data: analyze, process, visualize, trend, prediction
3. Functional Programming
    - distinctions
        - in imperative style: modifying variables as you go
        - in function style: write things as if were in math
        for example: 
        ```
        sqrt(4) 
        ```
    - advantages: 
        - clear codes + fewer bugs

# Intro to R Language - Console
1. Console is an R shell
```
> 42 + 5
[1] 47
> (42-43)**3
[1] -1
```
2. R can return logical values
```
> (2+1) == 3
[1] FALSE
> 2**10 > 10**3
[1] TRUE
```
3. notice: **2^10 = 1024 is slightly higher than 10^3**
4. R can also print values directly by using the "cat" function
```
>cat("hello")
hello
```

# Intro to R Language - Variables Definition
1. use "<-" to define a variable. defined variables will show in the environment. The list in the environement cannot be changed

# Intro to R Language - Conditionals
1. Conditional is uaed when one wants to do different things depending on the value of prior conputation
e.g) absolute values
```R
n <- -25

if(n < 0){

    abs <- -n
}else{

    abs <- n
}

cat(abs)
```

# Intro to R Language - Functions
1. A function usually contains parameters or dummy variable
```R
absValue <- function(x) {
    if(x < 0){

        -x
    }else{

        x
    }
}

cat(absValue(-4))
```
