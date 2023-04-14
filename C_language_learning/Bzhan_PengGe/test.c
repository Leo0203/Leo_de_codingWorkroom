# include <stdio.h>

Add(int a, int b){

    int z = a + b;
    return z;
}

int main(){

    int sum = 0;

    int a = 10;
    int b = 20;

    int num1 = 3; 
    int num2 = 4;

    sum = Add(a, b);
    printf("sum of a and b is: %d\n", sum);

    sum = Add(num1, num2);
    printf("sum of a and b is: %d\n", sum);
    
    return 0;
}