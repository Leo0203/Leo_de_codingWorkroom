// Design a program to re-order the list of number to be the smallest first and to the largest
// Input will be three random number, for example, [ -2, -999, 1000 ]
// Output should be something like "the new list of the number is -999, 2, 1000"
// You should write a function to do the re-order. Call the function you write in the main function to do the re-order

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int* reorder (int *arr);

int main(int argc, char**argv){
    int number_in_list = 20;
    int input_arr[number_in_list];
    int *output_arr;
    for (int i = 0; i < number_in_list; i++) 
    {
        input_arr[i] = atoi(argv[i+1]);
        printf("value is: %d \n", input_arr[i]);  
    }
    
    output_arr = reorder(input_arr);
    for (int j = 0; j < number_in_list; j++ ) 
    {
        printf("The new list of the number is: %d\n",output_arr[j]);
    }
    
    return 0;
}

int* reorder (int *arr)
{
    int temp = 0;
    int number_in_list = 20;
    for (int i = 0; i < number_in_list; i++)
    {
        // 4 1 9
        if (i == number_in_list-1) {
            break;
        }

        if (arr [i] > arr [i + 1])
        {
            temp = arr[i+1]; //store smaller value into temp
            arr[i+1] = arr[i]; //swap
            arr[i] = temp; // update
        }

    }
    return arr;
}