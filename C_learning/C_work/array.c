#include <stdio.h>

#define N 5
#define D 

int main()
{
    double score[5];
    int i;
    for (i = 0; i < N; i++)
    {
        printf("please enter the score for the class %d : \n", i + 1);
        scanf("%lf", &score[i]);
    }
    for (i = 0; i < N; i++)
    {
        printf("your score for the %d class is : %lf.2 \n", i + 1, score[i]);
    }
    return 0;
}


/******************************************************************************************************************************************
bluble sort
16, 25, 9, 90, 23
from the biggest to the smallest
bluble sort : read every elements and change the position

the first loop:
if a number is smaller than the previous one, then they excahnge their position
16, 25, 9, 90, 23
25, 16, 9, 90, 23
25, 16, 90, 9, 23
25, 16, 90, 23, 9 --> the smallest has went to the proper position

conclution: 
need to make more than one conparsion
the first loop need 4 times to compare an array with 5 element --> # of elements - 1
every next loop of comparison does not need to compare the smallest number. 
Therefore:  2 loop : 3 comparisons
            3 loop : 2 comparisons
            4 loop : 1 comparison
from above we can see:  need # of elements - 1 times loops of comparisons 
                        every next loop of comparison have -1 comparsons than the previous one : # of elements - 1 - # of the loop
******************************************************************************************************************************************/

int main_2 ()
{
    int i = 0, j = 0;
    int temp = 0;
    int arr[D] = {16, 25, 9, 90, 23};
    for (i = 0; i < D - 1; i++)         // number of loop
    {
        for(j = 0; j < N - 1 - i; j++)  // number of comparisons in each loop
        {
            if (arr[j] < arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr [j + 1] = temp;
            }
            
        }
    }

}

/******************************************************************************************************************************************
to delete an element, find the element and replace each index after to the previous one. Remember to subtract the length of the array
to insert an element, just insert it at the end, and remember to add the length of the array
******************************************************************************************************************************************/

int main_3()
{
    int count = 5; // # of element
    int arr[] = {16, 25, 9, 90, 23};
    int deleted_element;
    int deleted_index = -1; // giving an non-existed index, make comparison easier.
    int insert;
    int i = 0;
   
   // to delete
   
    printf("the element you want to deleted is: ");
    scanf("%d", &deleted_element);
    for (i = 0; i < count; i++)
    {
        if (deleted_element == arr[i])
        {
            deleted_index = i;
            break;
        }
    }
    if (deleted_index == -1)
    {
        printf("there is no such number.");
    }
    else
    {
        for (i = deleted_index; i < count - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        count--;
    }
    for (i = 0; i < count; i++)
    {
        printf("%d", arr[i]);
    }

    // to insert

    printf("enter what you want to insert: ");
    scanf("%d", &insert);
    arr[count] = insert;
    count++;
    for (i = 0; i < count; i++)
    {
        printf("%d", arr[i]);
    }
}

// print 2 demention array

int main_4()
{
    int i = 0, j = 0;
    int arr[4][3] = {
        {23, 24, 25},
        {26, 27, 28},
        {29, 30, 31},
        {32, 33, 34}
    };
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d", arr[i][j]);   //printf("%-d"); "-"means all to the left
        }
        
    }
}

int main_4()
{
    // to reverse an array
    int arr[] = {12, 13, 14, 15, 16};
    int temp = 0;
    int i = 0;
    int * ptr1 = arr; // to the first address
    int * ptr2 = arr + 4;
    while (ptr1 != ptr2)
    {
        temp = * ptr1;
        * ptr1 = * ptr2;
        * ptr2 = temp;
    }
    /*
    for (i = 0; i < 5/2; i++)
    {
        temp = arr[i];
        arr[i] = arr[5 - i - 1];
        arr[5 - i - 1] = temp;
    }
    */

    return 0;
}

// print 2d array using pointer

int main_5()
{
    int i = 0;
    int j = 0;
    double arr[5][3] = 
    {
        {11, 12, 13},
        {14, 15, 16},
        {17, 18, 19},
        {20, 21, 22},
        {23, 24, 25}
    };
    //double (* ptr_arr)[3] = arr;
    for (i = 0; i < 5; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%.2lf\t", arr[i][j]);
            //printf("%.2lf\t", * (arr[i] + j));
            //printf("%.2lf\t", * (* (ptr_arr + i) + j));
        }
        printf("\n");
    }
    return 0;
}