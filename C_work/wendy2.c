#include <stdio.h>
#include <stdlib.h>
#include <string.h>

float converter(int original_value, char capital);
int main(int argc, char**argv){
    int value = atoi(argv[1]);       // value of Canadian dollar will be stored here
    char* currency_type = argv[2];   // currency type will be stored here

    // date of the exchange rate data
    char * date;

    printf("Canadian dollar value is %d \n", value);
    printf("currency type is %s \n", currency_type);
    
    char currency_type_capital = currency_type[0]; 
   
    // data date
    date = "April 5th";

    /****************************************************
     1 Canadian dollar = 0.7 US dollar
     1 Canadian dollar = 4.98 Chinese yuan
     1 Canadian dollar = 0.65 Euro
     1 Canadian Dollar = 76.41 Japanese Yen
     1 Canadian Dollar = 54.13 Russian Ruble
    ****************************************************/
    // currency exchange rate 
    float result = 0;
    result = converter(value, currency_type_capital);

    switch (currency_type_capital)
    {
    case 'u' :
    case 'U' :
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f US dollar. \n",date, value, result);
        break;
    case 'c' :
    case 'C' :
        printf("According to the data of %s, %d Canadian dollar equals to %.2f Chinese yuan. \n",date, value, result);
        break;
    case 'e' :
    case 'E' :
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Euro. \n",date, value, result);
        break;
    case 'j' : 
    case 'J' :
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Japanese yen. \n",date, value, result);
        break;
    case 'r' :
    case 'R' :
        printf("Accroding to the data of %s, %d Canadian dollar equals to %.2f Russian Ruble. \n",date, value, result);
        break;
    }
    
return 0;
}


float converter(int original_value, char capital){
    float output = 0;
    if (capital == 'u' || capital == 'U'){
        output = original_value * 0.7;
        return output;
    }
    else if (capital == 'c' || capital == 'C'){
        output = original_value * 4.98;
        return output;
    }
    else if (capital == 'r' || capital == 'R') {
        output = original_value * 54.13;
        return output;
    }
    return 0;
}

