# include <stdio.h>
# include <string.h>


int main(){

    int try = 0;
    char password[6] = {0};
    char setPassword[6] = "123456";
   
    for(try = 0; try < 3; try++){

        printf("Please enter the password: ");
        scanf("%s", password);

        for(int i = 0; i < strlen(setPassword); i++){

            printf("%c", password[i]);
        }
    }

    if(try == 3){

        printf("Login Falled. \n");
    }
    return 0;
}

