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