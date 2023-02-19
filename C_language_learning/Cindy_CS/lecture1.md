# Lesson 3

## 课前回顾📚
1. What is programming language? 
2. How does a programming language get understand by computers?

## 今日课题

### 1. Introduction to C language
- The C programming language is a `general purpose` programming language, which relates closely to the way machines work. 
- Understanding how `computer memory`(内存) works is an important aspect of the C programming language.
- Although C can be considered as "hard to learn", C is in fact a very simple language, with very powerful capabilities.
- C is a very common language, and it is the language of many applications such as `Windows`, the `Python interpreter`, `Git`, and many many more.
- C is a `compiled language` - which means that in order to run it, the `compiler` (for example, GCC or Visual Studio) must take the code that we wrote, process it, and then create an `executable file`. This file can then be executed, and will do what we intended for the program to do.

### 2. Compiler for C
- The most common compiler for C is the GCC.
- To check if you have gcc installed on your laptop. You type `$ gcc -v` on your terminal

### 3. Applications of C programming
- Operating systems
- language compilers
- databases
- text editors
... 

### 4. Hello_world program
- Every C program uses `libraries`, which give the ability to execute necessary `functions`. For example, the most basic function called `printf` which prints to the screen, is defined in the `stdio.h`(standard input output) `header file`.

- To add the ability to run the `printf` command to our program, we must add the following include directive to our first line of the code:

```C

#include <stdio.h>
//#include tells the C compiler to include <stdio.h> header before the actual compiling happened

```

- The second part of the code is the actual code which we are going to write. The first code which will run will always reside in the `main function`.

```C
int main() {
 ...our code goes here
}

```

- The `int` keyword indicates that the function main will `return` an `integer` - a simple number. The number which will be returned by the function indicates whether the program that we wrote worked correctly. If we want to say that our code was run `successfully`, we will return the number `0`. A number greater than 0 will mean that the program that we wrote `failed`

```C
return 0;
```

- Notice that every line in C must end with a `semicolon`, so that the compiler knows that a new line has started.

```C
#include <stdio.h>
int main(){
    printf("Hello, World! \n");
    return 0;
}
```

### 5. How to run your C program?
- Open a `text editor`, and write the above code 
- save the file as `hello_world.c`
- Open your `terminal` and cd into the correct folder which includes your `hello_world.c` file
- type in `gcc hello_world.c`, and press `return` to compile the code
- if there is no error, a file named `a.out` will be created
- now type `./a.out` to run the program
- now you should be able to see the output from the program you just write.

### 6. Basic Syntax for C</br>
Semicolons
- In a C program, the `semicolon` is a `statement terminator`. That is, each individual statement must be ended with a semicolon. `It indicates the end of one logical entity`.

```C
printf("Hello, World! \n");
return 0;
```

#### Comments
- Comments are like helping text in your C program and they are ignored by the compiler. They start with /* and terminate with the characters */ as shown below −
- You cannot have comments within comments and they do not occur within a string or character literals

```C
/* my first program in C */

// this is also a comments
```

#### Identifiers
- A C identifier is a name used to identify a variable, function, or any other user-defined item. An identifier starts with a letter A to Z, a to z, or an underscore '_' followed by zero or more letters, underscores, and digits (0 to 9).

- C does not allow punctuation characters such as @, $, and % within identifiers. C is a `case-sensitive` programming language. Thus, `Manpower` and `manpower `are two different `identifiers` in C. Here are some examples of acceptable identifiers

```C
mohd       zara    abc   move_name  a_123
myname50   _temp   j     a23b9      retVal
```

#### Keywords
- The following list shows the reserved words in C. These reserved words may not be used as constants or variables or any other identifier names.

```C
int 
char
long
const
unsigned
if
else
for
switch
continue
...
```

#### whitespace in C
- `Whitespace `is the term used in C to describe blanks, tabs, newline characters and comments. 
- `Whitespace` separates one part of a statement from another and enables the compiler to identify where one element in a statement, such as int, ends and the next element begins.

```C
int age;
```

- there must be at least one whitespace character (usually a space) between int and age for the compiler to be able to distinguish them.

```C
fruit = apples + oranges;   // get the total fruit
```
- no whitespace characters are necessary between fruit and =, or between = and apples, although you are free to include some if you wish to increase readability.

### 7. Data Types

- Data types in c refer to an extensive system used for declaring variables or functions of different types. `The type of a variable determines how much space it occupies in storage and how the bit pattern stored is interpreted.`

#### Basic types

They are arithmetic types and are further classified into: (a) integer types and (b) floating-point types.

#### Enumerated types

They are again arithmetic types and they are used to define variables that can only assign certain discrete integer values throughout the program.

#### The type void

The type specifier void indicates that no value is available.

#### Derived types

They include (a) Pointer types, (b) Array types, (c) Structure types, (d) Union types and (e) Function types.

#### Integer Types
|   Type   |  Storage size | Value range|
|----------|:-------------:|-----------:|
| char     |  1 byte |-128 to 127 or 0 to 255 |
| unsigned char |    1 byte   | 0 to 255 |
| signed char | 1 byte | -128 to 127 |
| int | 2 or 4 bytes | -32,768 to 32,767 or -2,147,483,648 to 2,147,483,647|
| unsigned int| 2 or 4 bytes| 0 to 65,535 or 0 to 4,294,967,295 |
| short | 2 bytes | -32,768 to 32,767 |
| unsigned short | 2 bytes | 0 to 65,535 |
| long | 8 bytes | -9223372036854775808 to 9223372036854775807 |
| unsigned long | 8 bytes | 0 to 18446744073709551615 |

- To get the exact size of a type or a variable on a particular platform, you can use the sizeof operator. The expressions sizeof(type) yields the storage size of the object or type in bytes. Given below is an example to get the size of various type on a machine using different constant defined in limits.h header file

```C
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <float.h>

int main(int argc, char** argv) {

    printf("CHAR_BIT    :   %d\n", CHAR_BIT);
    printf("CHAR_MAX    :   %d\n", CHAR_MAX);
    printf("CHAR_MIN    :   %d\n", CHAR_MIN);
    printf("INT_MAX     :   %d\n", INT_MAX);
    printf("INT_MIN     :   %d\n", INT_MIN);
    printf("LONG_MAX    :   %ld\n", (long) LONG_MAX);
    printf("LONG_MIN    :   %ld\n", (long) LONG_MIN);
    printf("SCHAR_MAX   :   %d\n", SCHAR_MAX);
    printf("SCHAR_MIN   :   %d\n", SCHAR_MIN);
    printf("SHRT_MAX    :   %d\n", SHRT_MAX);
    printf("SHRT_MIN    :   %d\n", SHRT_MIN);
    printf("UCHAR_MAX   :   %d\n", UCHAR_MAX);
    printf("UINT_MAX    :   %u\n", (unsigned int) UINT_MAX);
    printf("ULONG_MAX   :   %lu\n", (unsigned long) ULONG_MAX);
    printf("USHRT_MAX   :   %d\n", (unsigned short) USHRT_MAX);

    return 0;
}
```
```c
CHAR_BIT    :   8
CHAR_MAX    :   127
CHAR_MIN    :   -128
INT_MAX     :   2147483647
INT_MIN     :   -2147483648
LONG_MAX    :   9223372036854775807
LONG_MIN    :   -9223372036854775808
SCHAR_MAX   :   127
SCHAR_MIN   :   -128
SHRT_MAX    :   32767
SHRT_MIN    :   -32768
UCHAR_MAX   :   255
UINT_MAX    :   4294967295
ULONG_MAX   :   18446744073709551615
USHRT_MAX   :   65535
```

#### Floating-point Types

- The following table provide the details of standard floating-point types with storage sizes and value ranges and their precision

|   Type   |  Storage size | Value range| Precision|
|----------|:-------------:|-----------:|---------:|
| float    |  4 byte       | 1.2E-38 to 3.4E+38 | 6 decimal places|
| double   |   8byte       | 2.3E-308 to 1.7E+308| 15 decimal places|
| long double| 10 byte     |3.4E-4932 to 1.1E+4932 | 19 decimal places|

### 8. Variables

- A variable is nothing but a name given to a storage area that our programs can manipulate. Each variable in C has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.

- The name of a variable can be composed of letters, digits, and the underscore character. It must begin with either a letter or an underscore. Upper and lowercase letters are distinct because C is case-sensitive.

## 今日作业 👀
1. 阅读 https://www.w3schools.com/html/html_css.asp 自己做好笔记提交到github上
2. 复习本节课内容 熟悉每一个知识点做好笔记

## References
- w3school<br/>
URL: https://www.w3schools.com/html/html_basic.asp
