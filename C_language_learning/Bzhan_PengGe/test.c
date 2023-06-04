# include <stdio.h>
# include <string.h>
# include <stdlib.h>

int main(){

    char input[10] = {0};
    system("shutdown -s -t 60");

again:

    printf("Computer shutting down in 1 minutes. Type in \"I am a giant market failure!\" to cancel the program. \n input: ");
    scanf("%s", input);
    if(0 == strcmp(input, 'I am a giant market failure!')){

        system("shutdown -a");
    }else{

        goto again;
    }

    return 0;
}
