# Vectors

## Review
1. Basic operations from last lecture...
```R

offer <- c(241, 590, 533, 425, 261)

offer > 400         #[1] FALSE TRUE TRUE TRUE FALSE
offer[offer > 400]  #[1] 590 533 425

# TRUE if and only if the element is between 400 and 550
offer > 400 & offer < 550   
offer[offer > 400 & offer < 550]    # [1] 425

# Get the elements that are outside of 400 and 550
offer[!(offer > 400 & offer < 550)] 
offer[offer < 400 | offer > 500]    #[1] 241 590 261
```
    - Tracing offer[offer > 400]
```R
offer[offer > 400]
############################
c(241, 590, 533, 425, 261)[c(241, 590, 533, 425, 261) > 400]
############################
c(241, 590, 533, 425, 261)[c(241> 400, 590> 400, 533> 400, 425> 400, 261> 400)]
############################
c(241, 590, 533, 425, 261)[c(FALSE, TRUE, TRUE, TRUE, FALSE)]
############################
c(590, 533, 425)
```
    - ** De Morgan's Law: !(A & B) == (!A | !B) **


## Manipulating Data in Vectors 
```R
offer <- c(241, 590, 533, 425, 261)
spec <-c("family doc", "cardiologist", "ortho", "dermotologist", "psychiatrist")
```
1. We can correspond data from one vector to another 
```R
# want to know the speciality that earns the most
spec[offer == max(offer)]   #[1] "cardiologist"
```
    - here offer == max(offer) will return vector(FALSE, TRUE, FALSE, FALSE)
    - spec[FALSE, TRUE, FALSE, FALSE] will output the spec[TRUE] value which is "cardiologist"

```R
# what is the location in the vector of the largest offer
location <- c(1, 2, 3, 4, 5)
location[offer == max(offer)]

(1:length(spec))[offer == max(offer)]   # 1:n meaning creating a vector of int from 1 to n
```
    - the first way of finding the index is not as good as the second method because the length of the vectors can be subject to change

2. practice: 
    - Write a function with the signiture: elems_below <- function(vec, upper_bound)
        - the function takes in a vector of numerics vec, and returns a vector that contains theelements of vec that are smaller or eaual to upper bound
```R
a <- c(5, 1, 2, 3)
elems_below <- function(vec, upper_bound){

    vec[vec >= upper_bound]
}

elems_below(a, 2)
```
        - To check a function, you can trace it down to simpler forms until when you can find the problem
    - Write a function my_median which takes in a vector of an odd length, and computes the median
        - The median of a collection of numbers is the number that's at the middle of the sorted collection

```R
a <- c(5, 1, 2, 10, 1, 2, 7)

my_median <- function(vec){

    sort(vec)[(length(vec)+1)/2]
}

my_median(a)
```
