# Lesson 3

## 课前回顾📚
1. What did you learn from last class?
2. Differences between global scope and local scope

## 今日课题
## 1. Operators<br/>

An `operator` is a symbol that tells the compiler to perform specific mathematical or logical functions. C language is rich in built-in operators and provides the following types of operators

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators
- Misc Operators

#### Arithmetic Operators<br/>

The following table shows all the arithmetic operators supported by the C language. Assume variable A holds 10 and variable B holds 20

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
| +    |  Add two operands | A + B = 30|
| -    | Subtracts second operand from the first | A - B = -10|
| *    |  Multiplies both operands | A * B = 200|
| /    |  Divides numerator by de-numerator | B/A = 2|
| %    | Modulus Operator and remainder of after an integer division | B % A = 0|
| ++    |  Increment operator increases the integer value by one. | A++ = 11|
| --    | Decrement operator decreases the integer value by one | A-- = 9|

#### Relational Operators<br/>

The following table shows all the relational operators supported by C. Assume variable A holds 10 and variable B holds 20

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
| == | Checks if the values of two operands are equal or not. If yes, then the condition becomes true |(A == B) is not true |
| != |	Checks if the values of two operands are equal or not. If the values are not equal, then the condition becomes true. |	(A != B) is true. |
| >	| Checks if the value of left operand is greater than the value of right operand. If yes, then the condition becomes true. |	(A > B) is not true. |
| <	| Checks if the value of left operand is less than the value of right operand. If yes, then the condition becomes true.	| (A < B) is true.|
| >= |	Checks if the value of left operand is greater than or equal to the value of right operand. If yes, then the condition becomes true.| 	(A >= B) is not true. |
| <= |	Checks if the value of left operand is less than or equal to the value of right operand. If yes, then the condition becomes true |	(A <= B) is true. |

#### Logical Operators<br/>

Following table shows all the logical operators supported by C language. Assume variable A holds 1 and variable B holds 0

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
| && |Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.|(A && B) is false.|
| &#124;&#124; |Called Logical OR Operator. If any of the two operands is non-zero, then the condition becomes true.|(A  &#124;&#124; B) is true.|
|!|Called Logical NOT Operator. It is used to reverse the logical state of its operand. If a condition is true, then Logical NOT operator will make it false.|!(A && B) is true.

#### Bitwise Operators<br/>

Bitwise operator works on bits and perform bit-by-bit operation. The truth tables for &, |, and ^ is as follows

p    |q    |p & q|p &#124; q|p ^ q
------|------|------|-----|-----
|0|	0|	0|	0|	0|
|0|	1|	0|	1|	1|
|1|	1|	1|	1|	0|
|1|	0|	0|	1|	1|


Assume A = 60 and B = 13 in binary format, they will be as follows −

A = 0011 1100

B = 0000 1101

A&B = 0000 1100

A|B = 0011 1101

A^B = 0011 0001

~A = 1100 0011

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
| & |Binary AND Operator copies a bit to the result if it exists in both operands. | (A & B) = 12, i.e., 0000 1100 |
| &#124;|	Binary OR Operator copies a bit if it exists in either operand. |(A &#124; B) = 61, i.e., 0011 1101 |
|^	|Binary XOR Operator copies the bit if it is set in one operand but not both.| (A ^ B) = 49, i.e., 0011 0001|
|~|	Binary One's Complement Operator is unary and has the effect of 'flipping' bits.	|(~A ) = ~(60), i.e,. -0111101 |
| << | Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.|	A << 2 = 240 i.e., 1111 0000|
| >>|	Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand. |	A >> 2 = 15 i.e., 0000 1111|

#### Assignment Operators<br/>

The following table lists the assignment operators supported by the C language:

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
|=	|Simple assignment operator. Assigns values from right side operands to left side operand |	C = A + B will assign the value of A + B to C|
|+=	|Add AND assignment operator. It adds the right operand to the left operand and assign the result to the left operand.	|C += A is equivalent to C = C + A|
| -=	|Subtract AND assignment operator. It subtracts the right operand from the left operand and assigns the result to the left operand. | C -= A is equivalent to C = C - A|
|*=|	Multiply AND assignment operator. It multiplies the right operand with the left operand and assigns the result to the left operand. |	C *= A is equivalent to C = C * A |
|/=	|Divide AND assignment operator. It divides the left operand with the right operand and assigns the result to the left operand.	|C /= A is equivalent to C = C / A|
|%=	|Modulus AND assignment operator. It takes modulus using two operands and assigns the result to the left operand.|C %= A is equivalent to C = C % A|
|<<=|Left shift AND assignment operator.|C <<= 2 is same as C = C << 2|
|>>=	|Right shift AND assignment operator.|C >>= 2 is same as C = C >> 2|
|&=	|Bitwise AND assignment operator.|C &= 2 is same as C = C & 2|
|^=|Bitwise exclusive OR and assignment operator.|C ^= 2 is same as C = C ^ 2|
| &#124;=	|Bitwise inclusive OR and assignment operator.|C &#124;= 2 is same as C = C &#124; 2|

#### Misc Operators ↦ sizeof & ternary </br>

Besides the operators discussed above, there are a few other important operators including `sizeof` and `? :` supported by the C Language

|  Operator |  Description | Example |
|:----------:|:-------------:|:-------:|
|sizeof()	|Returns the size of a variable.	|sizeof(a), where a is integer, will return 4.|
|&	|Returns the address of a variable.	|&a; returns the actual address of the variable.|
|*|	Pointer to a variable.|	*a;|
|? :	|Conditional Expression.|	If Condition is true ? then value X : otherwise value Y|

#### Operators Precedence in C </br>

Operator precedence determines the grouping of terms in an expression and decides how an expression is evaluated. Certain operators have higher precedence than others; for example, the multiplication operator has a higher precedence than the addition operator.

For example, x = 7 + 3 * 2; here, x is assigned 13, not 20 because operator * has a higher precedence than +, so it first gets multiplied with 3*2 and then adds into 7.

Reference: https://en.cppreference.com/w/c/language/operator_precedence

## 2. C Type Casting <br/>
Type Casting in C is used to convert a variable from one data type to another data type, and after type casting compiler treats the variable as of the new data type.

```c
(type_name) expression
```

#### Without Type Casting

```c
#include <stdio.h>
main ()
{
    int a;
    a = 15/6;
    printf("%d",a);
}
```

`In the above C program, 15/6 alone will produce integer value as 2.`

#### After Type Casting
```c
#include <stdio.h>
main ()
{
    float a;
    a = (float) 15/6;
    printf("%f",a);
}
```

`After type cast is done before division to retain float value 2.500000.`

## 3. Decision Making
- Decision making structures require that the programmer specifies one or more conditions to be evaluated or tested by the program, along with a statement or statements to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be `false`.

- C programming language assumes any `non-zero` and `non-null` values as `true`, and if it is either `zero` or `null`, then it is assumed as `false` value.

|  Sr.No. |  Statement & Description |
|:----------:|:-------------:|
|1|if statement, an if statement consists of a boolean expression followed by one or more statements.|
|2|if...else statement, an if statement can be followed by an optional else statement, which executes when the Boolean expression is false.|
|3|nested if statements, you can use one if or else if statement inside another if or else if statement(s).|
|4|else if statements|
|5|switch statement, a switch statement allows a variable to be tested for equality against a list of values.|

### if statements</br>
An if statement consists of a Boolean expression followed by one or more statements.

#### Syntax: 
```c
if(boolean_expression) {
   /* statement(s) will execute if the boolean expression is true */
}
```

If the Boolean expression evaluates to `true`, then the block of code inside the 'if' statement will be executed. If the Boolean expression evaluates to `false`, then the first set of code after the end of the 'if' statement (after the closing curly brace) will be executed.

C programming language assumes any `non-zero` and `non-null` values as `true` and if it is either `zero` or `null`, then it is assumed as `false` value.

#### Examples:
```c
#include <stdio.h>
 
int main () {

   /* local variable definition */
   int a = 10;
 
   /* check the boolean condition using if statement */
	
   if( a < 20 ) {
      /* if condition is true then print the following */
      printf("a is less than 20\n" );
   }
   
   printf("value of a is : %d\n", a);
 
   return 0;
}
```

#### Result:

```c
a is less than 20;
value of a is : 10
```

### if else statements</br>
An if statement can be followed by an optional else statement, which executes when the Boolean expression is false.

#### Syntax:
```c
if(boolean_expression) {
   /* statement(s) will execute if the boolean expression is true */
} else {
   /* statement(s) will execute if the boolean expression is false */
}
```

If the Boolean expression evaluates to `true`, then the `if block `will be executed, otherwise, the `else block` will be executed.

C programming language assumes any `non-zero` and `non-null` values as `true`, and if it is either `zero` or `null`, then it is assumed as `false` value.

#### Examples:
```C
#include <stdio.h>
 
int main () {

   /* local variable definition */
   int a = 100;
 
   /* check the boolean condition */
   if( a < 20 ) {
      /* if condition is true then print the following */
      printf("a is less than 20\n" );
   } else {
      /* if condition is false then print the following */
      printf("a is not less than 20\n" );
   }
   
   printf("value of a is : %d\n", a);
 
   return 0;
}
```

#### Result:
```C
a is not less than 20;
value of a is : 100
```

#### If...else if...else Statement
An if statement can be followed by an optional else if...else statement, which is very useful to test various conditions using single if...else if statement.

When using if...else if..else statements, there are few points to keep in mind: 
- An if can have zero or one else's and it must come after any else if's.

- An if can have zero to many else if's and they must come before the else.

- Once an else if succeeds, none of the remaining else if's or else's will be tested.

#### Syntax: 
```C
if(boolean_expression 1) {
   /* Executes when the boolean expression 1 is true */
} else if( boolean_expression 2) {
   /* Executes when the boolean expression 2 is true */
} else if( boolean_expression 3) {
   /* Executes when the boolean expression 3 is true */
} else {
   /* executes when the none of the above condition is true */
}
```

#### Example:
```C
#include <stdio.h>
 
int main () {

   /* local variable definition */
   int a = 100;
 
   /* check the boolean condition */
   if( a == 10 ) {
      /* if condition is true then print the following */
      printf("Value of a is 10\n" );
   } else if( a == 20 ) {
      /* if else if condition is true */
      printf("Value of a is 20\n" );
   } else if( a == 30 ) {
      /* if else if condition is true  */
      printf("Value of a is 30\n" );
   } else {
      /* if none of the conditions is true */
      printf("None of the values is matching\n" );
   }
   
   printf("Exact value of a is: %d\n", a );
 
   return 0;
}
```

#### Result:
```C
None of the values is matching
Exact value of a is: 100
```

## 今日作业 👀
1. 复习本节课内容 熟悉每一个知识点做好笔记
