#include <stdio.h>

double balance();

int main()
{
    struct account
    {
        char bankname;
        char accountNmae;
        double accountSaving;
        double billAmount;
    };
    
}

/*
double balance(double saving,double bill)
{
    return saving - bill;
}*/

/*
double balance(struct account )
{
    return account.accountSaving - account.billAmount;
}
*/

double balance (const struct account * account)
{
    return account -> accountSaving - account -> billAmount;;
}