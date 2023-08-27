# Intro to Program in C

## What is C
1. programming language: how human communicate with the computer
2. development of the computer language
    - binary language
        the hardware receive positive or negative signal (+: 1 ; -: 0)
        mnemoic: a word that represent a series of binary code
    - assembler language: programming using mnemoic
    - B
    - C -> modern langauage
        ANSI develop a global coding sdandard for C called C89

## Write a C Program
1. .c ending -> source document
2. .H ending -> header file
3. to run your code

```
    cd "/Users/mashilin/Documents/GitHub/Hello/C_language_learning/Bzhan_PengGe/..."
    gcc filename.c
    ./a.out 
```

    a.out is a file that has translate the code into binary code

4. helloWorld.c

```c
    # include <stdio.h> 
    //include a file called stdio.h; std-standard, i-input, o-output

    int main(){
        
        //main function - entry of the code, must have one and can only have one
        //int means that it returns an integer 

        printf("Hello World!\n");

        //printf is a library function, function saved in advance for use
        //use #include to include the library containing printf function
        // \n represent return to the next line
        
        return 0;
    }
```

## Variable and Variable Types
1. char: store one character, use %c in printf to print the character
2. short: store a relative small integer
3. int: store a relative large integer, use %d in printf to print the number
4. long: store a even bigger integer
5. long long: store a very big integer
6. float: store a shorter decimal number, use %f in printf to print the decimal number
7. double: store a longer decimal number, use %lf in printf to print the decimal number
8. different variable type has different length of byte, thus can save some memory if needed
    - bit -> byte -> kb -> mb -> gb -> tb -> pb
    - one bit can only save one "1" or "0"
    - one byte is 8 bit, one kb is 1024 byte, one mb is 1024 kb, and so on...

9. variableType.c
```c

    #include <stdio.h>

    int main(){

        char ch = 'A';
        //char: request part of the memory (1 byte) to save a character 'A'

        printf("%c\n", ch);
        //%c represents to print a char; ch represents the char printed is the ch variable

        int num = 20;

        printf("%d\n", num);
        //%d represents to print a based 10 integer; num represents the integer printed is the num variable 

        float dec = 13.1f;
        //f at tne end of the decimal number rerpresent that the variable type is float, or the system would regard 13.1 as a double automatically


        printf("size of a char is %d\n", sizeof(char));     //1 byte
        printf("size of a short is %d\n", sizeof(short));   //2 byte
        printf("size of a int is %d\n", sizeof(int));       //4 byte
        printf("size of a long is %d\n", sizeof(long));     //8 byte
        printf("size of a float is %d\n", sizeof(float));   //4 byte
        printf("size of a double is %d\n", sizeof(double)); //8 byte

        return 0;
    }

```

10. variable can be local or global.
    - scope of a variable: scope of a variable represents where the variable can be used
        - global variables is defined outside of the code block, i.e outside of the {}. It can be used in all code blocks, even code blocks outside of the file but within the folder. However, you need to declare the variable first
        ```c
            extern int g_val;
        ```
        - local variables is defined within the code block, i.e within the {}. It can be used in all code blocks within the {} it is defined.
    - local variables are priortized before global variables in a code block
    - local variables only works in the coding block it is being defined

11. globalvsLocal.c
```c

    #include <stdio.h>

    int global = 1;
    //global variable
    int a = 100;

    int main(){

        int local = 5;
        //local variable

        int a = 10;
        printf("%d\n", a);    //10; local covers global, thus avoid have the same name for global and local variables. 
            
        return 0;
    }

```
12. simpleOperations.c
```c
    #include <stdio.h>

    int main(){

        int num1 = 0; 
        int num2 = 0;
        int sum = 0;

        scanf("%d%d", &num1, &num2);
        //& will find the address of num1 and num2. thus the line means save the first number to the memory of num1 and second number to num2. To locate the memory the program need the address

        sum = num1 + num2;
        //C rule: variables have to be defined at the beginning of the code block
        printf("sum = %d\n", sum);
        return 0;
    }
```
14. life cycle...
    - of a local variable: life cycle of a local variable begins as the code block containing it begins and ends when the code block ends.
    - of a global variable: equals to the life of the main function -> the life of the whole program

## Constants
1. types of Constants: literal constant, const modified variables, #define identifier constant, enumeration constant

```c
    # include <stdio.h>

    #define num2 10 //#define identifier constant

    //enumeration constant
    enum Sex{
            male, female, other
        };

    int main(){

        3; //literial constant, cannot be changed

        const int num = 3;
        //an int variable that cannot be changed
        //num = 8; this would be an error
        //notice that sometimes only constant works:
        int arr[num] = {0}; //if num is a variable this would be an error

        printf("%d\n", male);   //0
        printf("%d\n", female); //1
        printf("%d\n", other);  //2

        enum Sex sex = male;
        sex = other;            //this would not be an error because sex itself is a variable
                                //male = female; this would be an error because male is a constant defined by enumeration


        return 0;
}
```
## String
1. Some character enclosed by the double quote symbol is called a String Literal, or a String
2. An feature of the string is that a escape character \0 is placed at the end, having an value of 0. The escape character would not be counted as the content of the string and would not be counted in the length of the string. 

```c
    # include <stdio.h>

    int main(){

        "";         //this would be an empty string
        "Hello!\n"; //this would be a normal string

        char arr1[] = "hello";  //an array can be used to save a string
        char arr2[] = {'h', 'e', 'l', 'l', 'o'};
        char arr3[] = {'h', 'e', 'l', 'l','o', '\0'};
        printf("%s\n", arr1);   //print "hello"
        printf("%s\n", arr2);   //print "hellohello" because \0 does not exist and the print does not end, resulting in printing random characters
        printf("%s\n", arr3);   //print "hello" because we manually add on a \0 to represent the end

        return 0;
    }
```

3. All letters and some special characters are all identified as an ASCII code
4. String length can be measured by strlen(string) 

```c
    # include <stdio.h>

    int main(){

        char arr1[] = "hello";  
        char arr2[] = {'h', 'e', 'l', 'l', 'o'};
        char arr3[] = {'h', 'e', 'l', 'l', 'o', 0};
        
        printf("%d\n", strlen(arr1));   //print 5
        printf("%d\n", strlen(arr2));   //print a random number since the method do not when to stop without the \0
        printf("%d\n", strlen(arr3));   //print 3 since we put an /0 at the end (remember \0 has a value of 0)

        return 0;
    }
```
## Escape characterr
1. escape character consist of two part: a"\" and a character. Escape character is a symbol to represent something that is usually not easy to code
    ex. \n ---- new line
        \t ---- tab
        \' ---- represent " ' "
        \" ---- represent " " " in a string
        \\ ---- represent " \ "
        \0 ---- the end of a string
        \### -- represent one to three base 8 number -> convert to base 10 -> find matching ASCII code
        \x## -- represent two base 16 number -> convert to base 10 -> find matching ASCII code

## Array
1. array can save a sequence of the same type of variables
2. each element has an index. Index tarting from 0.
3. an array can be defined as this
```c
    int arr[10] = [1,2,3,4,5,6,7,8,9,10];
```
4. in memeory, the elements are saved in consecutive spaces. The whole space used saving the array is called the name of the array. This is also the reason index for arrays work

## Operators
1. mathmatics: +, -, *, /, %(find the remainder)
2. shift: <<, >> (shift the binary reprsentation of variables)
3. bitwise operator: &(与), |(或), ^(异或)
4. assignment operator: =, +=, -=, /=, *=, /=, &=, ^=, |=, >>=, <<=
5. unary operator: !, -, +, &(get the address), sizeof, ~(reverse the binary representation), --, ++, *(indeirect access operator), (type) (switch the type of varibble)
6. relational operator: >, <, >=, <=, !=, ==
7. logic operator: &&, ||
8. conditional operator: expression 1 ? expression 2 : expression 3
```c

# include <stdio.h>

int main(){

//shift operator
    int a = 1;
    /*
    an int variable occupy 4 byte -> 32 bit
    00000000000000000000000000000001
    */

    int b = a<<2;
    /*
    this shift the whole binary number to the left by 2
    00000000000000000000000000000100
    thus b is 4, however, a itself is not changed
    int b = a + 3; this would do the same
    */
//bitwise operator
    int c = a & b;
    /*
    a is 011 as binary
    b is 101 as binary
    c is 001 and thus is 1
    */
    int d = a | b;
    /*
    a is 011 as binary
    b is 101 as binary
    d is 111 and thus is 7
    */
    int e = a ^ b;
    /*
    a is 011 as binary
    b is 101 as binary
    d is 110 and thus is 6
    when both are the same, it is 0; when different, it is 1
    */

//uniary operator
    int f = 10;
    int arr[] = {1, 2, 3, 4, 5, 6};
    printf("%d\n", sizeof(a));      //4
    printf("%d\n", sizeof(int));    //4
    printf("%d\n", sizeof(arr));    //find the size of the array in byte -> 24
    printf("%d\n", sizeof(arr) / sizeof(arr[0]));   //find the number of elements 

    int g = 10; 
    int h = g++;    //++ placed behind: program first do h = g; then g = g + 1. Thus h = 10
    int i = ++g;    //++ placed before: program first do g = g + 1; then i = g. Thus i = 11
    int j = g--;    //-- placed behind: program first do j = g; then g = g - 1. Thus j = 10
    int k = --g;    //-- placed before: program first do g = g - 1; then k = g. Thus k = 9

    int l = (int)3.33; 

//conditional operator
    int m = 71;
    int n = 3;
    int max = (m>n ? m : n);    //is m bigger than m? if yes then max = m, if not max = n


    return 0;
}
```

## Keywords
1. register: a variable that is suggested to be saved in temporary torage (fastest storage that the cpu can access)
2. signed: a vairable that can be negative and positive
3. unsigned: a vairable that can only be positive
4. struct: structure
5. typedef: to give another name for a particular type of varible
6. auto: auto varibles, all local variables are auto variables. Thus you can write 
```c
    auto int a = 10;
```
    to define a variable, but auto is usually abbreviated
7. static: to make an variable static, making a local variable has longer life cycle; or changing the scope of a global variable, only the file the global variable is defined, not useable outside of the orginal file. Static can also be added in front of a method to change the link attribute: cannot be linked outside the file it isd defined and can only be called within the file
```c
    # include <stdio.h>

    void test(){

        static a = 1;       //a static variable, a saves the result of previous calculation, if no static, this would print  five 2
                            //the life cycle of a goes outside of the test method
        a++;
        printf("%d\n", a);  //2 3 4 5 6

    }
    int main(){

        int i = 0;
        while(i < 5){
            test();
            i++;
        }
        return 0;
    }
```
## use #define to define constant and macros
1. macro: a constant with a parameter
```c
    # include <stdio.h>

    #define maX 100;    //a constant max equals to 100 defined by "#define"

    //macro
    #define MAX(X, Y) (X>Y?X:Y)  //the expression MAX(X, Y) would eventually turns to (X>Y?X:Y)

    //method
    int Max(int x, int y){

        if(x > y){
            return x;
        }else{
            return y;
        }
    }

    int main(){

        int a = 10;
        int b = 20;

        //method
        int max = Max(a, b);
        print("max = %d\n", max);   //20

        //macro
        max = MAX(a, b);
        printf("max = %d\n", max);  //20
        
        return 0;
    }
```
## Pointer
1. memory: 64 bit -> 64 cords link to the memory, each can be +(1) or -(0). Thus there are a series of 0 and 1 in total 64 off them. There are 2^64 different numbers that rerpresent each unit of memory that is called address. Each unit of memory is one byte
```c
    # include <stdio.h>

    int main(){

        int a = 10;     //4 byte is used in the memeory
        int* p = &a;        //get the address of a, int* is used to save the address
                            //the pointer type must be the same as original variable
                            //pointer in 64 bit would have 8 byte in memory, regardless of the different types of cariable
        printf("%p\n", &a); //0x7ff7b4319498 shown the address in base 16

        *p = 20;             //to manipulate what is saved in p, * get what is saved in p
                             //the address need memmory to save as well (64 bit -> 8 byte)
        
        printf("%lf\n", a);
        printf("%lf\n", *p);    //both would print 20. 
                             
        return 0;
    }
```
## Struct
1. a new type of "varibale" that is defined to contain a set of variables
```c
# include <stdio.h>
# include <string.h>

    struct Book{

        char name[20];
        double price;
    };//this defines a type

    int main()
    {
        struct Book b1 = {"The Great Gasby", 16.99};    //this create a new instance of the book structure

        printf("book name: %s\n", b1.name);
        printf("book price: %f\n", b1.price);
        return 0;

        //the content of the variables inside a structure cannot be changed directly
        strcpy(b1.name, "Hamlet");
        printf("new book name: %s\n", b1.name);
    }
``` 


## If statement
1. carry out the code inside the block if the condition is met
```c
    # include <stdio.h>

    int main(){

        int input;
        printf("enter a unit digit number: ");
        scanf("%d\n", &input);

        if(input%2 == 0){
            printf("you entered an even number.\n");
        }else{
            printf("you entered an odd number.\n");
        }
    }
```

## While statement
1. do a certain thing repreatedly
2. there are three types: while, for, do while
```c
    # include <stdio.h>

    int main(){

        int day;

        while(day <= 7){

            printf("A day has passed\n");
            day ++;

        }
        if(day == 7){

            printf("Seven days have passed\n");
        }
        
        return 0;
    }
```

## Method 
1. A method is a block of code that can take parameters and carry out a certain task. It formed by extrapulate abstract logic behind a code and make it into a reuseable block

```c

    # include <stdio.h>

    int Add(int a, int b){

        int z = a + b;
        return z;
    }

    int main(){

        int sum = 0;

        int a = 10;
        int b = 20;

        int num1 = 3; 
        int num2 = 4;

        sum = Add(a, b);
        printf("sum of a and b is: %d\n", sum);

        sum = Add(num1, num2);
        printf("sum of a and b is: %d\n", sum);
        
        return 0;
    }
```
2. The above showned add method is a customized method, c language also has its own methods