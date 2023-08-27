#include<stdio.h>


int whilecount = 0;
int main()
{
    int value = 0;
    register int i;
    printf("please enter how many times you want to cerculate:");
    while(scanf("%d", &value) == 1 && value > 0)
    {
        whilecount ++;
        for(i = value; i >= 0; i--)
        {
            counter(i);
        }
    }
   
    return 0;
}