#include<stdio.h>

#define N 5

void input();
void sort();
void show();
int find(double*scores, int findmun);

int main()
{
    double scores[N];
    double findnum = 0;
    input(scores);
    show(scores);
    sort(scores);
    printf("please enter the number you want to find:");
    scanf("%lf", &findnum);
    printf("the index of the number is: %d\n", find(scores, findnum));

    return 0;
}
int find(double*scores, int findnum)
{
    int findindex = -1;
    int i = 0;
    for (i = 0; i < N; i++)
    {
        if (findnum == scores[i])
        {
            findindex = i;
            break;
        }
    }
    return findindex;
}

void input(double scores[])
{
    int i = 0;
    for (i = 0; i < N; i++)
    {
        printf("please enter the score for the %d class: " ,i + 1);
        scanf("%lf", &scores[i]);
        //scanf("%lf", (scores + I));
    }
}
void show(double scores[])
{
    int i = 0;
    printf("************************************************\n");
    printf("English\tMath\tPhysic\tChemistry\tArt\n");
    for (i = 0; i < N; i++)
    {
        printf("%.2lf\t", *(scores + i));
    }
    printf("\n************************************************\n");
}
void sort(double scores[])
{
    int i = 0;
    int j = 0;
    double temp = 0;
    for (i = 0; i < N - 1; i++)
    {
        for (j = 0; j < N - 1; j++)
        {
            if (scores[j] > scores[j + 1])
            {
                temp = scores[j];
                scores [j + 1] = scores[j];
                scores [j + 1] = temp;
            }
        }
    }
}