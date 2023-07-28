# Function

## What is Function
1. Function is a code block to achieve a certain task, and is independent of other code in the program. 
2. Usually a function has parameters, return values. 
3. Functions in C can be devided into library function and custom function 

## Library Function
1. Certain function already included in head files for the programmers to use. So that the coding becomes easier. 
2. types: IO, string manipulation, char manipulation, memory manipulation, time, math, etc
3. check [c++ website](www.cplusplus.com) for all the library functions
    here is a few examples:
    ```c
    //strcpy 
    #include <string.h>
    char * strcpy (char * destination, const char * source );
    /*
    * destination - the string you want to paste to. Should be longer or equal to source to avoid overflow
    * source - the string yuo want to copy including the terminating null character and therefore stopped at that point
    */
    char arr1[] = "hello"; 
    char arr2[] = "#############";
    strcpy(arr2, arr1); //arr1 is therefore copied to arr2 as hello\0######
    //memset
    void * memset (void * ptr, int value, size_t num);
    /*
    * ptr - pointer pointed to the memory block saving the value
    * value - int value to be set but the function will fill an unsigned char type of the variable
    * num - number of bytes set to the value
    */
    char arr[] = "hello world";
    memset(arr, '*', 5);    //replace the value of first five char in arr address to *
    ```
## Custom Function
1. Consist of a name, return type and parameter. All of them are defined by the programmer. 
2. A basic program can be look like this:
    return type name (parameter, ){

        statement;  
    }
3. Usually a certain task that is implemented several times would be construct as a function to make the main function more easy to read. 
4. Notice the scope of the variable, change of local variables in the function would not result in change of value in the main function
```c
# include <stdio.h>

void swap(int a, int b){

    int temp = a; 
    a = b;
    b = temp;
}

void swapCorrectly(int* pa, int* pb){

    int temp = pa;
    *pa = *pb;
    *pb = temp;
}

int main(){

    int x = 10;
    int y = 20;

    /*
    * this would change the order for a and b in the swap function but not for x and y here
    * this is because the program create separate memory slot for x, y, a, b
    */
    swap(x, y);     
    
    //using the address directly can change the value stored in the address
    swapCorrectly(&x, &y);


    return 0;
}
```
5. parameters:
    - formal parameter: the parameter included in the declaration of the function, destroied after the function finished execution, and thus only vaild within the function.
    - actual parameter: the parameter passed to the declared function in main function, must be an actual value, but may be an expression, a variable, a constant etc. 
    - passing the value: when the function is implemented, the formal parameters becomes a temporary copy of the actual parameter. Any change to formal would not affect the actual parameters. 
    - passing the address: the variable address is passed to the function, allowing the function to manipulate variables outside of the function

## Nested FUnction and Chain Access
1. A function used inside another function is called a nested use. 
2. A function's parameter is another function's return is called a chain access of function
3. Here is a fun exercise
```c
printf("%d", printf("%d", printf("%d", 43)));
```
the code will print 4321. The third printf will print 43. The second printf will print the return of third printf. The first printf will print the return of the second printf. Notice that the printf function return the number of character it printed. 

## Declare of Function and Define of Function
1. A declaration of the function must be included before the function is called. Declaration show the name, parameter, return type, but does not concern whether the function actually exist. It is usually included in a header file. A function must be declared before called
    - A declaration is like 
    ```c
    int Add(int x, int y);
    ```
3. A definition of the function include what the function can do. Here is an example
```c
# include <stdio.h>

int Add(int x, int y);  //declaration

int main(){

    int a= 1; 
    int b = 2;
    int result = Add(a, b); //call

    return 0;

}

int Add(int x, int y){  //definition

    int z = x + y;
    return z;
}
```
4. The declaration of the function can be included into a head file and the definition can be included in a .c file. When the function is needed, the head file will be included and use by calling the function. A sample head file is as shown below
```c
#ifndef __NAMEOFTHEHEADFILE_H__
#define __NAMEOFTHEHEADFILE_H__ //the full explanation of these lines will be in the last lesson. 
/*
* if not defined before then include all the codes in the head file to the main file; whereas the head file is included again, the same code would not be copied again
*/

//declaration of the function
int Function(int parameter);

#endif
```
5. When using the head file, the name of the head is sorrounded by quotation mark rather than <>.


## Function Recursion
1. The function called on the function itself. This allows to eliminate many lines in the code by coverting a complex problem into a smaller, similar question that requires solve repetitively to get the result of the bigger problem. 
2. There are two requirements of recursion: 
    - a limit to the recursion: the recursion end when the limitation reach
    - every recursion get closer to the limit
        - it would be worth noticing that fulfillment of the requirements would not make sure the recursion works, it might be stackoverflow or other problems. 
3. examples: print an integer separating its digit
```c
#include <stdio.h>

void printByDigit(int n){

    if(n>9) {
        printByDigit(n/10);
    }
    printf("%d ", n%10);
}
/*
* first time the function is called, n = 123 > 9 and thus 12 is passed to the PBD function again
* 12 is passed and 12 > 9 and the PBD is called again
* 1 is passed and pass the if statement, print the number 1
* return to the second time the function is called, the if statement is finished and print 12%10 = 2
* return to the first time the function is called, the if statement is finished and print 123%10 = 3
* thus this function print 1 2 3 which separate the digit of 123
*/

int main() {

    int num = 123;

    printByDigit(num);
    return 0;
}
```


## Practice
1. write a function that judge if a number is a prime number or not
```c
# include <stdio.h>
# include <math.h>

int isPrime(int n){
    int i = 0;
    for(i = 2; i <= sqrt(n); i++){

        if(n % i == 0){

            return 0;
        }
    }

    return 1;
}

int main(){

    int num = 0;
    int judge = -1;
    int count = 0;

    for(num = 100; num < 201; num++){

        judge = isPrime(num);
        switch (judge)
        {
        case 1:
            printf(" %d", num);
            count++;
            break;
        case 0: 
            break;
        default:
            break;
        }

    }

    printf("\n%d\n", count);
    
    return 0;
}
```

2. construct a unction that does binary search
```c
# include <stdio.h>
# include <math.h>

int binarySearch(int arr[], int size, int aim){   //the actual parameter passed to here for arr is only the address of the first element

    //int size = sizeof(arr) / sizeof(arr[0]); sizeof(arr) will return the size of the pointer to the first element, not the array
    int beginIndex = 0;
    int endIndex = size -1;
    int middleIndex = -1;

    
    while(beginIndex <= endIndex){

        middleIndex = (endIndex + beginIndex)/2;
        if(aim == arr[middleIndex]){
            
            return middleIndex;
        }else if(aim < arr[middleIndex]){

            endIndex = middleIndex - 1;
        }else if(aim > arr[middleIndex]){

            beginIndex = middleIndex + 1;
        }
    }

    return -1;
}

int main(){

    int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int aimIndex = -1;
    int size = sizeof(arr) / sizeof(arr[0]);

    aimIndex = binarySearch(arr, size, 8);

    if(aimIndex == -1){

        printf("The number is not included.\n");
    }else{

        printf("The number is found. It index is: %d\n",aimIndex);
    }
    return 0;
}

```
3. find the designated fibonacci number
```c
# include <stdio.h>

int fibonacci (int n){  //this would be extremely slow because many uncessary calculations are carried out 

    if (n == 1){

        return 1;
    }else if(n == 2){
        
        return 1;
    }else{

        return fibonacci(n - 1) + fibonacci (n - 2);      
    }
}

int fibonacciLoop(int n){

    if(n <= 2){

        return 1;
    }else{
        int a = 1;
        int b = 1;
        int c = 0;
        while(n > 2){

            c = a + b;
            a = b;
            b = c;
            n--;
        }

        return c;
    }
}

int main(){

    int n = 6;
    printf("the %d fibonacci number is: %d\n", n, fibonacci(n));
    return 0;
    
}
```
4. example: find the length of a string without creating a temporary count variable
```c
# include <string.h>
# include <stdio.h>

int lengthOfStr (char* str){

    int count = 0;  //a count variable that is temporary
    while(*str != '\0'){

        count++;
        str++;
    }

    return count;
}

int lengthOfStr2 (char* str){

    if(*str == '\0'){

        return 0;
    }else{

        return 1+lengthOfStr2 (str + 1);
    }
}

int main(){

    char arr[] = "Hello";

    printf("%d\n", lengthOfStr(arr));

    return 0;
}
```
5.example: find the factorial of n
```c

# include <stdio.h>


int factorial (int n){

    if(n <= 1){

        return 1;
    }else{

        return factorial(n - 1) * n;
    }
}

int main(){

    int num = 5;
    printf("the factorial of %d is %d\n", num, factorial(num));
    
    return 0;
}
```

4. find the length of a string without creating a temporary count variable
```c
# include <string.h>
# include <stdio.h>

int lengthOfStr (char* str){

    int count = 0;  //a count variable that is temporary
    while(*str != '\0'){

        count++;
        str++;
    }

    return count;
}

int lengthOfStr2 (char* str){

    if(*str == '\0'){

        return 0;
    }else{

        return 1+lengthOfStr2 (str + 1);
    }
}

int main(){

    char arr[] = "Hello";

    printf("%d\n", lengthOfStr(arr));

    return 0;
}

```
5. find the factorial of n
```c

# include <stdio.h>


int factorial (int n){

    if(n <= 1){

        return 1;
    }else{

        return factorial(n - 1) * n;
    }
}

int main(){

    int num = 5;
    printf("the factorial of %d is %d\n", num, factorial(num));
    
    return 0;
}
```