// greatest common divisor

// int a = 8, int b = 12 -> 4
//int GCD(int x, int y) -> return greatest_common_divisor

//notice error handling

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int GCD(int num1, int num2);

int main(int argc, char**argv){


    int a = atoi(argv[1]); // first value store here
    int b = atoi(argv[2]); // second value store here
    
    printf("The first value is %d \n", a);
    printf("The second value is %d \n", b);

    int GCD(int a, int b);

    int final_result = GCD(a, b);
    if (final_result == -1) {
        printf("one of the number is zero... error");
    }
    printf("The great common devisor of %d and %d is %d. \n", a, b, final_result);
    

    return 0; 
}

//edge case 
// int GCD(int num1, int num2){
//     if (num1 == 0 || num2 == 0) {
//         return -1;
//     }

//     int divisor = 1;
//     int result = 0;

//     while ((divisor <= num1 || divisor <= num2) && (num1 != 0 && num2 != 0))
//     {
//         if (num1 % divisor == 0 && num2 % divisor == 0)
//         {
//             result = divisor;
//         }
//         divisor++;
//     }

//     return result;
// }
   

int GCD(int num1, int num2) {
    if(num1 == 0 || num2 == 0){
        return -1;
    }

    int temp;
    int r; 
    //swap, store the larger one in num1
    if (num1 < num2) {
        temp = num1;
        num1 = num2;
        num2 = temp;
    }

    while ( num2 != 0 ) {
        r = num1 % num2;
        num1 = num2;
        num2 = r;
    }
    
    //98 56 -> r = 42
    //56 42 -> r = 14
    //42 14 -> r = 0
    //14 0 -> return 14
    return num1;
}