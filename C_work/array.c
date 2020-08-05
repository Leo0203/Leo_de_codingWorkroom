#include<stdio.h>

#define N 5
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