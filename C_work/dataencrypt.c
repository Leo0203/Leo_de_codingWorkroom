
#include<stdio.h>
#include<stdlib.h>

#define KEY 5 //offset(偏移量)

/**
* encrypt the input 
* input: char which need to be encrypt
* output: char which have  been encrypt
*/
char * encrypt(char[]);

int main()
{
    char password[50] = "123456";
    encrypt(password);
    printf("the encrypted password is: %s\n", password);
    return 0;
}

char * encrypt(char password[])
{
    int i = 0;
    int count = strlen(password);
    for(;i < count; i++)
    {
        password[i] = password[i]+i+KEY;
    }
    return password;
}