# Lesson 4

## 课前回顾📚
1. Explain the code to me 
2. What did you learn from last class?

## 今日课题
## 1. Variables

- A `variable` is nothing but a name given to a `storage area` that our programs can manipulate. `Each variable in C has a specific type, which determines the size and layout of the variable's memory`; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.

- The name of a `variable` can be composed of `letters`, `digits`, and the `underscore character`. It must begin with either a `letter` or `an underscore`. Upper and lowercase letters are distinct because C is `case-sensitive`.

```c
int a = 10;
int a1 = 100;
int _a = 1000;
// int 1a is not ok
```

|   type  |  description |
|----------|:-------------:|
| char     |  Typically a single ont byte. This is an integer type|
| int |  The most natural size of integer for the machine |
| float | A signle-precision floating point value |
| double | A double-precision floating point value |
| void | represent the absence of type|

C programming language also allows to define various other types of variables, which we will cover in subsequent chapters like `Enumeration`, `Pointer`, `Array`, `Structure`, `Union`, etc.

### Variable Definition in C
`A variable definition tells the compiler where and how much storage to create for the variable.` A variable definition specifies a data type and contains a list of one or more variables of that type as follows −

```c
type variable_list;
```

Here, `type` must be a valid C data type including `char`, `int`, `float`, `double`, `bool`, or any user-defined object; and `variable_list` may consist of one or more `identifier names separated by commas`.

```c
int    i, j, k;
char   c, ch;
float  f, salary;
double d;
```

The line `int i, j, k;` declares and defines the variables i, j, and k; which instruct the compiler to create variables named i, j and k of type int.

`Variables can be initialized (assigned an initial value) in their declaration.` The initializer consists of an equal sign followed by a constant expression

```c
type variable_name = value;
```

some examples:
```c
extern int d = 3, f = 5;    // declaration of d and f. 
int d = 3, f = 5;           // definition and initializing d and f. 
byte z = 22;                // definition and initializes z. 
char x = 'x';               // the variable x has the value 'x'.
```
For definition without an initializer: variables with `static storage` duration are implicitly initialized with `NULL` (all bytes have the value 0); the initial value of all other variables are `undefined`.

### Variable Declaration in C
- A variable declaration provides assurance to the compiler that there exists a variable with the given type and name so that the compiler can proceed for further compilation without requiring the complete detail about the variable. A variable definition has its meaning at the time of compilation only, the compiler needs actual variable definition at the time of linking the program.

- A variable declaration is useful when you are using multiple files and you define your variable in one of the files which will be available at the time of linking of the program. You will use the keyword `extern` to declare a variable at any place. Though you can declare a variable multiple times in your C program, it can be defined only once in a file, a function, or a block of code.

```C
#include <stdio.h>

// Variable declaration:
extern int a, b;
extern int c;
extern float f;

int main () {

   /* variable definition: */
   int a, b;
   int c;
   float f;
 
   /* actual initialization */
   a = 10;
   b = 20;
  
   c = a + b;
   printf("value of c : %d \n", c);

   f = 70.0/3.0;
   printf("value of f : %f \n", f);
 
   return 0;
}
```
When the above code is compiled and executed, it produces the following result

```C
value of c : 30
value of f : 23.333334
```

The same concept applies on function declaration where you provide a function name at the time of its declaration and its actual definition can be given anywhere else

```C
// function declaration
int func();

int main() {

   // function call
   int i = func();
}

// function definition
int func() {
   return 0;
}
```

### Lvalues and Rvalues in C
</br>
There are two kinds of expressions in C.

- `lvalue` - Expressions that refer to a memory location are called "lvalue" expressions. An lvalue may appear as either the left-hand or right-hand side of an assignment.
- `rvalue` - The term rvalue refers to a data value that is stored at some address in memory. An rvalue is an expression that cannot have a value assigned to it which means an rvalue may appear on the right-hand side but not on the left-hand side of an assignment.

Variables are lvalues and so they may appear on the left-hand side of an assignment. Numeric literals are rvalues and so they may not be assigned and cannot appear on the left-hand side.

```c
int g = 20; // valid statement

10 = 20; // invalid statement; would generate compile-time error
```

## 2. Constants
- Constants refer to fixed values that the program may not alter during its execution. These fixed values are also called literals.

- Constants can be of any of the basic data types like an integer constant, a floating constant, a character constant, or a string literal. There are enumeration constants as well.

- Constants are treated just like regular variables except that their values cannot be modified after their definition.

### Defining Constants
There are two simple ways in C to define constants:
- using `#define` preprocessor
- using `const` keyword

#### The #define preporcessor

```c
#define identifier value
```

check this example
```c
#include <stdio.h>

#define LENGTH 10
#define WIDTH  5
#define NEWLINE '\n'

int main() {
   int area;  
  
   area = LENGTH * WIDTH;
   printf("value of area : %d", area);
   printf("%c", NEWLINE);

   return 0;
}
```
#### The const Keyword

```c
const type variable = value;
```

```C
#include <stdio.h>

int main() {
   const int  LENGTH = 10;
   const int  WIDTH = 5;
   const char NEWLINE = '\n';
   int area;  

   area = LENGTH * WIDTH;
   printf("value of area : %d", area);
   printf("%c", NEWLINE);

   return 0;
}
```

Note that it is a good programming practice to define constants in CAPITALS.

### C Variable Scope
- A `scope` is a region of the program, and the scope of variables refers to the area of the program where the variables can be accessed after its declaration.
- In C every variable defined in scope. You can define scope as the section or region of a program where a variable has its existence; moreover, that variable cannot be used or accessed beyond that region.
- In C programming, variable declared within a function is different from a variable declared outside of a function. The variable can be declared in three places. These are:

|  position  |  Type |
|----------|:-------------:|
| Inside a function or a block | local variables|
| Out of all functions |  global variables |
| In the function parameters| Formal parameters|

#### Local Variables
Variables that are declared within the function block and can be used only within the function is called local variables.

```c
#include <stdio.h>
 
int main ()
{
    /* local variable definition and initialization */    int x,y,z;
     
    /* actual initialization */    x = 20;
    y = 30;
    z = x + y;
     
    printf ("value of x = %d, y = %d and z = %d\n", x, y, z);

    return 0;
}
```

#### Global Scope
Variables that are declared outside of a function block and can be accessed inside the function is called global variables.

```C
#include <stdio.h>

/* global variable definition */int z;

int main ()
{
    /* local variable definition and initialization */    int x,y;
     
    /* actual initialization */    x = 20;
    y = 30;
    z = x + y;
     
    printf ("value of x = %d, y = %d and z = %d\n", x, y, z);
     
    return 0;
}
```

## 今日作业 👀
1. 复习本节课内容 熟悉每一个知识点做好笔记
