#include <stdio.h>

int money = 0, count = 0, i = 0;

int moneys[100];

char unit[10][4] = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

int main()
{
    printf("Please enter a number of money： ");
    scanf("%d", &money);
    while (money != 0)
    {
        moneys[i] = money % 10;
        money /= 10; 
        i++;
        count++;
    }
    printf("You entered %d numbers.\n", count);
    for (int i = count - 1; i > -1; i--)
    {
        printf("%d - %s \n", moneys[i], unit[moneys[i]]);
    }
}