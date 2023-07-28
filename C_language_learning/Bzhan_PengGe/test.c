# include <stdio.h>

int fibonacciLoop(int n){

    if(n <= 2){

        return 1;
    }else{
        int a = 1;
        int b = 1;
        int c = 0;
        while(n > 2){

            c = a + b;
            a = b;
            b = c;
            n--;
        }

        return c;
    }
}

int main(){

    int n = 4;
    printf("the %d fibonacci number is: %d\n", n, fibonacciLoop(n));
    return 0;
}
