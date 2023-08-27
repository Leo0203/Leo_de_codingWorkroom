#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i, j, x;
    for ( i = 0; i < 4; i++)       //the first loop control the number of lines and \n (行)
    {
        for (x = 0; x <= 2 - i; x++)
        {
            printf(" ");
        }
        for ( j = 0; j <= i * 2; j++)    //the second loop control the row and the symbol (列)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}


/***********************************************************
*
***
*****
*******
i = 0 j = 0
i = 1 j = 2
i = 2 j = 4
i = 3 j = 6
conclution: j = i * 2
***********************************************************/