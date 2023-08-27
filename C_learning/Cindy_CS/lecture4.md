# Lesson 4

## 课前回顾📚
1. What did you learn from last class?
2. what is the different between `&a` and `a && b` and `a & b`?

## 今日课题
## 1. switch statement <br/>

A `switch` statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each `switch case`.

Syntax:
```c
switch(expression) {

   case constant-expression  :
      statement(s);
      break; /* optional */
	
   case constant-expression  :
      statement(s);
      break; /* optional */
  
   /* you can have any number of case statements */
   default : /* Optional */
   statement(s);
}
```

Some restrictions for a switch statement:
- The `expression` used in a `switch` statement must have an integral or enumerated type, or be of a class type in which the class has a single conversion function to an integral or enumerated type.

- You can have any number of case statements within a switch. Each case is followed by the value to be compared to and a colon.

- The `constant-expression` for a case must be the same data type as the variable in the switch, and it must be a constant or a literal.

- When the variable being switched on is equal to a case, the statements following that case will execute until a `break` statement is reached.

- When a `break` statement is reached, the switch terminates, and the flow of control jumps to the next line following the switch statement.

- Not every case needs to contain a `break`. If no `break` appears, the flow of control will fall through to subsequent cases until a break is reached.

- A `switch` statement can have an optional `default` case, which must appear at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.


Example: 
```c
#include <stdio.h>
 
int main () {

   /* local variable definition */
   char grade = 'B';

   switch(grade) {
      case 'A' :
         printf("Excellent!\n" );
         break;
      case 'B' :
      case 'C' :
         printf("Well done\n" );
         break;
      case 'D' :
         printf("You passed\n" );
         break;
      case 'F' :
         printf("Better try again\n" );
         break;
      default :
         printf("Invalid grade\n" );
   }
   
   printf("Your grade is  %c\n", grade );
 
   return 0;
}
```
## 2. The ? : Operator <br/>

The `if...else` can be replace into the `conditional operator ?:` in the following form:

```c
Exp1 ? Exp2 : Exp3;
```

where Exp1, Exp2 and Exp3 are expressions. Notice the use and placement of the colon.

The value of a ? expression is determined like this:

- Exp1 is evaluated. If it is true, then Exp2 is evaluated and becomes the value of the entire ? expression.

- If Exp1 is false, then Exp3 is evaluated and its value becomes the value of the expression.

Example:
```c
int a = 5;
int b = 10;
int c = 0;
(c == 0) ? c = a : c = b;
```

## 3. Loop

You may encounter situations, when a block of code needs to be executed several number of times. In general, statements are executed sequentially: The first statement in a function is executed first, followed by the second, and so on.

Programming languages provide various control structures that allow for more complicated execution paths.

C programming language provides the following types of loops to handle looping requirements:

|  Sr.No. |  Loop Type & Description |
|:----------:|:-------------:|
|1|while loop, repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body|
|2|for loop, executres a sequence of statements multiple times and abbreviates the code that manages the loop variable|
|3|do...while loop, it is more like a while statement, except that it tests the condition at the end of loop body.|
|4|nested loops, you can use one more loops inside any other while, for, or do...while loop|

### while loop in C

A while loop in C programming repeatedly executes a target statement as long as given condition is true

Syntax:

The syntax of a `while` loop in C programming language is:

```c
while(condition) {
   statement(s);
}
```

Here, `statement(s)` may be a single statement or a block of statements. The `condition` may be any expression, and true is any nonzero value. The loop iterates while the condition is true.

When the condition becomes false, the program control passes to the line immediately following the loop.

Example:
```c
#include <stdio.h>
 
int main () {

   /* local variable definition */
   int a = 10;

   /* while loop execution */
   while( a < 20 ) {
      printf("value of a: %d\n", a);
      a++;
   }
 
   return 0;
}
```

### for loop in c

A `for` loop is a repetition control structure that allows you to efficiently write a loop that needs to execute a specific number of times.

Syntax:
```c
for ( init; condition; increment ) {
   statement(s);
}
```

Here is the flow of control in a 'for' loop:

- The `init` step is executed first, and only once. This step allows you to declare and initialize any loop control variables. You are not required to put a statement here, as long as a `semicolon` appears.

- Next, the `condition` is evaluated. If it is true, the body of the loop is executed. If it is false, the body of the loop does not execute and the flow of control jumps to the next statement just after the 'for' loop.

- After the body of the 'for' loop executes, the flow of control jumps back up to the increment statement. This statement allows you to update any loop control variables. This statement can be left blank, as long as a semicolon appears after the condition.

- The condition is now evaluated again. If it is true, the loop executes and the process repeats itself (body of loop, then increment step, and then again condition). After the condition becomes false, the 'for' loop terminates.

Example:
```c
#include <stdio.h>
 
int main () {

   int a;
	
   /* for loop execution */
   for( a = 10; a < 20; a = a + 1 ){
      printf("value of a: %d\n", a);
   }
 
   return 0;
}
```

### do while in c

Unlike `for` and `while` loops, which test the loop condition at the top of the loop, the `do...while` loop in C programming checks its condition at the bottom of the loop.

A `do...while` loop is similar to a while loop, except the fact that it is guaranteed to execute at least one time.

Syntax:
```c
do {
   statement(s);
} while( condition );
```

- Notice that the conditional expression appears at the end of the loop, so the statement(s) in the loop executes once before the condition is tested.

- If the condition is true, the flow of control jumps back up to do, and the statement(s) in the loop executes again. This process repeats until the given condition becomes false.

Example:
```c
#include <stdio.h>
 
int main () {

   /* local variable definition */
   int a = 10;

   /* do loop execution */
   do {
      printf("value of a: %d\n", a);
      a = a + 1;
   }while( a < 20 );
 
   return 0;
}
```

### loop control statements

Loop control statements change execution from its normal sequence. When execution leaves a scope, all automatic objects that were created in that scope are destroyed.

|  Sr.No. |  Control Statement & Description |
|:----------:|:-------------:|
|1|break statement, Terminates the `loop` or `switch` statement and transfers execution to the statement immediately following the loop or switch |
|2|continue statement, Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.|
|3|goto statement, Transfers control to the labeled statement.|

### The infinite loop

A loop becomes an infinite loop if a condition never becomes false. The for loop is traditionally used for this purpose. Since none of the three expressions that form the 'for' loop are required, you can make an endless loop by leaving the conditional expression empty.

```c
#include <stdio.h>

int main () {

   for( ; ; ) {
      printf("This loop will run forever.\n");
   }

   return 0;
}
```

When the conditional expression is absent, it is assumed to be true. You may have an initialization and increment expression, but C programmers more commonly use the for(;;) construct to signify an infinite loop.

## 4. Functions

A function is a group of statements that together perform a task. Every C program has at least one function, which is `main()`, and all the most trivial programs can define additional functions.

You can divide up your code into separate functions. How you divide up your code among different functions is up to you, but logically the division is such that each function performs a specific task.

A function `declaration` tells the compiler about a function's name, return type, and parameters. A function `definition` provides the actual body of the function.

The C standard library provides numerous built-in functions that your program can call. For example, `strcat()` to concatenate two strings, `memcpy()` to copy one memory location to another location, and many more functions.

A function can also be referred as a method or a sub-routine or a procedure.

### Defining a function

The general form of a function definition in C programming language is as follows: 

```c
return_type function_name( parameter list ) {
   body of the function
}
```

A function definition in C programming consists of a function header and a function body. Here are all the parts of a function: 

- `Return Type` − A function may return a value. The return_type is the data type of the value the function returns. Some functions perform the desired operations without returning a value. In this case, the return_type is the keyword void.

- `Function Name `− This is the actual name of the function. The function name and the parameter list together constitute the function signature.

- `Parameters` − A parameter is like a placeholder. When a function is invoked, you pass a value to the parameter. This value is referred to as actual parameter or argument. The parameter list refers to the type, order, and number of the parameters of a function. Parameters are optional; that is, a function may contain no parameters.

- `Function Body` − The function body contains a collection of statements that define what the function does.

Example:
```c
/* function returning the max between two numbers */
int max(int num1, int num2) {

   /* local variable declaration */
   int result;
 
   if (num1 > num2)
      result = num1;
   else
      result = num2;
 
   return result; 
}
```

### Function Declarations

A function `declaration` tells the compiler about a function name and how to call the function. The actual body of the function can be defined separately.

A function declaration has following parts:
```c
return_type function_name( parameter list );
```

For the above defined function max(), the function declaration is as follows:
```c
int max(int num1, int num2);
```

Parameter names are not important in function declaration only their type is required, so the following is also a valid declaration: 

```c
int max(int, int);
```

Function declaration is required when you define a function in one source file and you call that function in another file. In such case, you should declare the function at the top of the file calling the function.

## 今日作业 👀
1. 复习本节课内容 熟悉每一个知识点做好笔记
