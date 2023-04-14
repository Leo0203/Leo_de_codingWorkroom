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
    cd "/Users/mashilin/Documents/GitHub/Hello/C_language_learning/Bzhan/..."
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
3. bitwise operator: &, |, ^
4. assignment operator: =, +=, -=, /=, *=, /=, &=, ^=, |=, >>=, <<=

## If statement
1.carry out the code inside the block if the condition is met
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
2. The above showned add method is a customized method, c language also has its own method