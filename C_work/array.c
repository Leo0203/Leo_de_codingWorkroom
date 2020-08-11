#include<stdio.h>

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