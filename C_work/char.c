#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    //the way we define char
    //the difference between character string and the character array is the last "\0"
    char names1[] = {"j", "a", "c", "k", "\0"};
    char names2[50] = "jack";                   //more spaces is better and less chance to have a bug
    int i = 0;
    gets(names2); // this equals to scanf("%s", names2); but only for char
    fgets(names2, 10, stdin);   // get 10 characters and input to names2
                                // attention: fgets automatically put \n at last
    printf("%s", names2);
    printf("************************\n");
    printf("content of names2: \n");
    for (i = 0; i < 50; i++)
    {
        printf("%d\n", names2[i]);
    }
    return 0;
}


int main()
{
    char words[50];
    int len;
    printf("please enter some character: ");
    fgets(words, 20, stdin);
    len = myStrlen(words);
    printf("lenth of the char: %d\n", len);
    int myStrlen(char str[])
        {
            int count = 0; //lenth of the char
            while (str[count] != "\0")
            {
                if (str[count] == "\n")
                {
                    str[count] = '\0';
                    break;
                }
                count ++;
            }
            return count;
        };

    return 0;
}