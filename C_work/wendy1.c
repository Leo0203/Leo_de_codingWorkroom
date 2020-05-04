#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv){
    int value = atoi(argv[1]);       // value of Canadian dollar will be stored here
    char* currency_type = argv[2];   // currency type will be stored here
    // type of currency
    float Value_USD , Value_C_yuan , Value_Euro , Value_J_yen , Value_R_ruble; 
    // date of the exchange rate data
    char * date;

    printf("Canadian dollar value is %d \n", value);
    printf("currency type is %s \n", currency_type);
    
    // currency exchange rate 
    Value_USD = value * 0.7;
    Value_C_yuan = value * 4.98;
    Value_Euro = value * 0.65;
    Value_J_yen = value * 76.41;
    Value_R_ruble = value * 54.13;
    // data date
    date = "April 5th";

    /****************************************************
     1 Canadian dollar = 0.7 US dollar
     1 Canadian dollar = 4.98 Chinese yuan
     1 Canadian dollar = 0.65 Euro
     1 Canadian Dollar = 76.41 Japanese Yen
     1 Canadian Dollar = 54.13 Russian Ruble
    ****************************************************/
   
   // how to check which currency user entered
    if (strcmp(currency_type, "USD") == 0){  
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f US dollar. \n",date, value, Value_USD);
    }else if(strcmp(currency_type, "Chinese_yuan") == 0){
        printf("According to the data of %s, %d Canadian dollar equals to %.2f Chinese yuan. \n",date, value, Value_C_yuan);
    }else if(strcmp(currency_type, "Euro") == 0){
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Euro. \n",date, value, Value_Euro);
    }else if (strcmp(currency_type, "Japanese_yen") == 0){
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Japanese yen. \n",date, value, Value_J_yen);
    }else if (strcmp(currency_type, "Russian_Ruble") == 0){
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Russian Ruble. \n",date, value, Value_R_ruble);
    }
    
    return 0;
}
