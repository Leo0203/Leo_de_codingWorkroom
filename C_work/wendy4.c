// Design a program to get the max value and min value for an array of 5 integers
// input format: [8, 99, 23, 4, 100]
// output format: The max value is %d, the min value is %d

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int generate_max(int a[]);
int generate_min(int a[]);

int main(int argc, char**argv) {

    int input_arr[5];
    for (int i = 0; i < 5; i++) {
        input_arr[i] = atoi(argv[i+1]);
        //printf("value is: %d \n", input_arr[i]);
        
    }
    
    int max = generate_max(input_arr);
    printf("The max value is %d. \n", max);

    int min = generate_min(input_arr);
    printf("The min value is %d. \n", min);
    return 0;
}

int generate_max(int a[]) {
    int max = INT_MIN, i = 0;
    for (i = 0; i < 5; i++)
    {
        if (max < a[i]) {
            max = a[i];
        }
       
    }
    return max;
}
int generate_min(int a[]) {
    int min = INT_MAX, i = 0;
    for (i = 0; i < 5; i++)
    {
        if (min > a[i]){
            min = a[i];
        }
        
    }
    return min;
}