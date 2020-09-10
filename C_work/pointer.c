#include<stdio.h>

int main()
{
    int num1 = 1024;
    int num2 = 2048;
    int *ptr1 = & num1;
    int *ptr2 = & num2;
    printf("number 1 = %d \n", num1);
    printf("number 1's address = %p \n", ptr1);
    printf("number 2 = %d \n", num2);
    printf("number 2's address = %p \n", ptr2);
    num1 = num2; // *ptr1 = *ptr2 can also give the number of num1 to num2
    printf("after the changing...\n");
    printf("number 1 = %d \n", num1);
    printf("number 1's address = %p \n", ptr1);
    printf("number 2 = %d \n", num2);
    printf("number 2's address = %p \n", ptr2);
// the first element of the array has the same address as the whole array

// print an array in differnt ways

    int i = 0;
    double arr[] = {23, 24, 25, 26, 27};
    double *ptr_arr = arr;
    for (i = 0; i < 5; i++)
    {
        printf("%.2lf\n", ptr_arr[i]);
        // printf("%.2lf\n", *(ptr_arr + i));   // the best !!
        // printf("%.2lf\n", *ptr_arr++);       // if want to print the same array again, need double *ptr_arr = arr;

        /*********************************************************************************************
        the i+1 element in the array:               adress: &num[i], num+i
                                                    number: num[i], *(num+i)
        give an array a pointer:                    int * ptr_num = num, int *ptr_num = &num[0]
        a pointer can point to a certain element:   int * ptr_num = num + 4,int *ptr_num = &num[4]
        *********************************************************************************************/
    }

    return 0;
 }
 

