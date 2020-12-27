#include <stdio.h>

int main()
{
    //the scope of a variable
    int num = 9;
    {
        int num = 99;
        printf("%d\n", num);//99
        //printf("%d\n", num1 + num2); can be shown
    }
    printf("%d\n", num);    //9
    //printf("%d\n", num1 + num2); cannot be shown, for the num in the second {} cannnot be visited by the larger {}

    return 0;
}   