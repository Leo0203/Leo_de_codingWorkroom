#include <stdio.h>

int factorial(int num);

int main()
{
    int result = factorial(5);
    printf("the number is %d", result);
}

int factorial(int num)
{
    if (num == 1)
    {
        return 1;
    }
    else
    {
        num = num * factorial(num -1);
        return num;
    }

}
