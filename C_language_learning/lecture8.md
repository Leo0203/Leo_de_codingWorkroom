# Lesson 8

## 课前回顾📚
1. What did you learn from last class?
2. Explain array of pointers

## 今日课题
### 1. String
Strings are actually `one-dimensional array` of characters terminated by a `null` character `'\0'`. Thus a null-terminated string contains the characters that comprise the string followed by a `null`.

The following declaration and initialization create a string consisting of the word "Hello". To hold the null character at the end of the array, the size of the character array containing the string is one more than the number of characters in the word "Hello."

```c
char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\0'};
```

If you follow the rule of array initialization then you can write the above statement as follows: 

```c
char greeting[] = "Hello";
```

Actually, you do not place the `null` character at the end of a string constant. The C compiler automatically places the '\0' at the end of the string when it intializes the array. Let us try to print the above mentioned string: 

```c
#include <stdio.h>
int main() {
    char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\0'};
    printf("Greeting message: %s\n", greeting);
    return 0;
}
```

Result:
```c
Greeting message: Hello
```

C supports a wide range of functions that mainpulate `null-terminated` strings:
1. strcpy(s1, s2): Copies string s2 into string s1
2. strcat(s1, s2): Concatenates string s2 onto end of string s1.
3. strlen(s1): Returns the length of string s1
4. strcmp(s1, s2): Returns 0 if s1 and s2 are the same; less than 0 if s1 < s2; greater than 0 of s1 > s2.
5. strchr(s1, ch): Returns a pointer to the first occurrence of character ch in string s1.
6. strstr(s1, s2): Returns a pointer to the first occurrence of string s2 in string s1

Example: 
```c
#include <stdio.h>
#include <string.h>

int main () {

   char str1[12] = "Hello";
   char str2[12] = "World";
   char str3[12];
   int  len ;

   /* copy str1 into str3 */
   strcpy(str3, str1);
   printf("strcpy( str3, str1) :  %s\n", str3 );

   /* concatenates str1 and str2 */
   strcat( str1, str2);
   printf("strcat( str1, str2):   %s\n", str1 );

   /* total lenghth of str1 after concatenation */
   len = strlen(str1);
   printf("strlen(str1) :  %d\n", len );

   return 0;
}
```

Result:
```c
strcpy( str3, str1) :  Hello
strcat( str1, str2):   HelloWorld
strlen(str1) :  10
```

### 2. Struct
Arrays allow to define type of variables that can hold several data items of the same kind. Similarly `structure` is another user defined data type available in C that allows to combine data items of different kinds.

`Structures` are used to represent a record. Suppose you want to keep track of your books in a library. You might want to track the following attributes about each book:
1. Title
2. Author
3. Subject
4. Book ID

#### Defining a Structure

To define a structure, you must use the `struct` statement. The struct statement defines a new data type, with more than one member. The format will be:
```c
struct [structure tag] {

   member definition;
   member definition;
   ...
   member definition;
} [one or more structure variables];  
```

The structure tag is optional and each member definition is a normal variable definition, such as int i; or float f; or any other valid variable definition. At the end of the structure's definition, before the final semicolon, you can specify one or more structure variables but it is optional. Here is the way you would declare the Book structure:

```c
struct Books {
   char  title[50];
   char  author[50];
   char  subject[100];
   int   book_id;
} book;  
```

A structure variable can either be declared with structure declaration or as a separate declaration like basic types.

```c
// A variable declaration with structure declaration. 
struct Point 
{ 
   int x, y; 
} p1;  // The variable p1 is declared with 'Point' 
  
  
// A variable declaration like basic data types 
struct Point 
{ 
   int x, y; 
};  
  
int main() 
{ 
   struct Point p1;  // The variable p1 is declared like a normal variable 
}
```

#### How to initialize structure member?
Structure members `cannot` be initialized with declaration. For example the following C program fails in compilation.

```c
struct Point
{
   int x = 0;  // COMPILER ERROR:  cannot initialize members here
   int y = 0;  // COMPILER ERROR:  cannot initialize members here
};
```

The reason for above error is simple, when a datatype is declared, no memory is allocated for it. Memory is allocated only when variables are created.

Structure members `can be initialized` using curly braces ‘{}’. For example, following is a valid initialization.

```c
struct Point 
{ 
   int x, y; 
};  
  
int main() 
{ 
   // A valid initialization. member x gets value 0 and y 
   // gets value 1.  The order of declaration is followed. 
   struct Point p1 = {0, 1};  
}
```

#### How to access structure elements?
Structure members are accessed using dot(.) operator.

```c
#include<stdio.h> 
  
struct Point 
{ 
   int x, y; 
}; 
  
int main() 
{ 
   struct Point p1 = {0, 1}; 
  
   // Accessing members of point p1
   p1.x = 20;
   printf ("x = %d, y = %d", p1.x, p1.y);
  
   return 0;
}
```

Result:
```c
x = 20, y = 1
```

#### What is designated initialization?
Designated Initialization allows structure members to be initialized in any order.

```c
#include<stdio.h>
  
struct Point
{ 
   int x, y, z; 
}; 
  
int main() 
{ 
   // Examples of initialization using designated initialization 
   struct Point p1 = {.y = 0, .z = 1, .x = 2}; 
   struct Point p2 = {.x = 20}; 
  
   printf ("x = %d, y = %d, z = %d\n", p1.x, p1.y, p1.z); 
   printf ("x = %d", p2.x); 
   return 0; 
} 
```

Result:
x = 2, y = 0, z = 1
x = 20

#### Array of structures

Like other primitive data types, we can create an array of structures:

```c
#include<stdio.h>
  
struct Point
{
   int x, y;
};
  
int main()
{
   // Create an array of structures
   struct Point arr[10];
  
   // Access array members
   arr[0].x = 10;
   arr[0].y = 20;
  
   printf("%d %d", arr[0].x, arr[0].y);
   return 0;
}
```

Result:
10 20

#### limitations of C structures
In C language, Structures provide a method for packing together data of different types. A Structure is a helpful tool to handle a group of logically related data items. However, C structures have some limitations.

The C structure does not allow the struct data type to be treated like built-in data types, we cannot use operators like +,- etc. on Structure variables. For example, consider the following code:

```c
struct number 
{ 
    float x; 
}; 
int main() 
{ 
    struct number n1,n2,n3; 
    n1.x=4; 
    n2.x=3; 
    n3=n1+n2; 
    return 0; 
} 
  
/*Output: 
  
prog.c: In function 'main': 
prog.c:10:7: error:  
invalid operands to binary + (have 'struct number' and 'struct number') 
  n3=n1+n2; 
  
*/
```
