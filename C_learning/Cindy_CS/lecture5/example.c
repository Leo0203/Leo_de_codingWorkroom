#include <stdio.h>
 
/* global variable declaration */
int a = 20;
int sum(int *a, int *b);
int main () {

  /* local variable declaration in main function */
  int a = 10;
  int b = 20;
  int c = 0;

  printf ("value of a in main() = %d\n",  a);
  c = sum( &a, &b); //0x0000 -> 10, 0x0004 -> 20
  printf ("value of c in main() = %d\n",  c);

  return 0;
}

/* function to add two integers */
// 0x4000, 0x4004 
//int *a = &a 0x4000 -> 0x0000
//int *b = &b 0x4004 -> 0x0004
int sum(int* a, int* b) {
   // a -> interger type pointer

   printf ("value of a in sum() = %d\n",  *a); 
   printf ("value of b in sum() = %d\n",  *b);

   return (*a) + (*b);
}