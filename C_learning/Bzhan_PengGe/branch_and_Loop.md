# Branch and Loop

## A Strucuture Based Language
1. there are three structures in daliy life: sequencial, selective, and loop structure
2. selective statement: if, switch
3. loop statement: while, for, do while
4. A statement is a line of code seaparate by colon. A single colon on a line is an empty statement. 

## Selective Statement: if
1. grammar
    if(expression){
        statement;
    }

    if(expression)
        statement 1;
    else
        statement 2;

    if(expression 1)
        statemtn 1;
    else if(expression 2)
        statement 2;
    else
        statement 3;
2. if the statements include more than one, then you need {} to merge them as a block
```c
# include <stdio.h>

int main() {
    int a = 0;
    int b = 2;
    if(a == 1)
    {
        if(b == 2) {
            printf("hehe\n");
        }
    }
    else
    {
        printf("haha\n");
    }
    //this return haha since a is not equal to one and the block of the first if is not carryed out 
    return 0; 

}
```
3. else goes with the closest if statement 

## Selective Statement: switch
1. used when there are many options and variations
    switch(integer expression){
        case integer constant:
            statement;

    }
2. a default statment can deal with input that does not match any cases. Default can be placed anywhere. 

```c
# include <stdio.h>

int main() {
    int day = 0;
    switch(day) //only int can be put as the parameter
    {
        case 1: //only constant can be put after case
            printf("Monday\n"); 
            break;  //break is required, or the following cases would also be executed
                    //case only determine where the block begins to be executed, break will stop the execution after the case is finished
        case 2: 
            printf("Tuesday\n"); 
            break;
        case 3: 
            printf("Wednesday\n"); 
            break;
        case 4: 
            printf("Thursday\n"); 
            break;
        case 5: 
            printf("Friday\n"); 
            break;
        case 6: 
            printf("Saturday\n"); 
            break;
        case 7: 
            printf("Sunday\n"); 
            break;
        default:
            printf("Unrecognized input");
            break;
        
    }
    return 0; 

}

```
```c
# include <stdio.h>

int main() {
    int day = 0;
    switch(day)
    {
        case 1: 
        case 2: 
        case 3:
        case 4:
        case 5: 
            printf("weekdays\n"); 
            break;
        case 6: 
        case 7: 
            printf("weekends\n"); 
            break;
        
    }
    return 0; 

}
```
## Loop Statement: while
1. while statement
    while(expression){
        statement;
    }
    while is carried out in the following sequesnce
    expression == 0 -> exit
    expression != 0 -> carry out statement -> reexamine the expression
    expression != 0 -> carry out statement -> break; -> exit
    expression != 0 -> carry out statement -> continue; -> ignore all the following statments and reexamine the expression
    ```c
        # include <stdio.h>

        int main() {
            int i = 0;
            while(i < 11){

                printf("%d\n", i);
                i++;
            }
            return 0; 

        }
    ```
    this code will print number from 0 to 10.
    ```c
        int main() {
        int i = 0;
        while(i < 11){

            if(i == 5){
                break;
            }
            printf("%d\n", i);
            i++;
        }
        return 0; 

        }
    ```
    this code will print number from 0 to 4, and break from 5
    ```c
        int main() {
        int i = 0;
        while(i < 11){

            if(i == 5){
                continue;
            }
            printf("%d\n", i);
            i++;
        }
        return 0; 

    }
    ```
    this code will print number from 0 to 4, and continue looping number 5
    ```c
    int main() {
        int i = 0;
        while(i < 11){

            i++;
            if(i == 5){
                continue;
            }
            printf("%d\n", i);
            
        }
        return 0; 

    }
    ```
    this code will print number from 0 to 10 except 
2. while loop can be used in a particular case of cleaning the arbiturary memory for input 
    ```c
    # include <stdio.h>
    int main(){

            int confirm = 0;
            int ch = 0;
            char password[20] = {0};
            printf("please enter the password: ");  //when the user finished enter the password, they would press enter (\n)
            scanf("%s", password);                  //scanf will record anything before a space or a special character like \n
            while ((ch = getchar()) != '\n'){       //getchar will keep store the char(s) after a space or special character until reach \n
                ;
            }
            printf("Please enter Yes(Y) or No(N) to confirm: ");    //the line can carry out normally. Without the loop before it, this getchar will read a char after a space or some special characters
            confirm = getchar();
            if(confirm == 'Y'){

                printf("password confirmed\n");
            }else{
                
                printf("password unconfirmed\n");
            }

            //this program however do not record the correct password if there are a space within the password
            return 0;
        }

    ```
## Loop Statement: for
1. grammar
    for(expression 1; expression 2; expression 3){
        statement;
    }
    expression 1 is the initialize of the condition
    expression 2 is to judge the condition
    expression 3 is to adjust the condition
    the benefit is to see all three condition in one line at the start, avoid these three separated, such as in while loop
    ```c
    # include <stdio.h>

    int main(){
        //initialize, judge, adjust in one line
        for(int i = 0; i < 11; i++){

            printf("%d", i);
        }
        return 0;
    }
    ```
    this loop print the number from 0 to 10 as well
2. the logic behind the expression is: 
    expression 1 initialize -> expression 2 judge -> expression 2 == 0 -> exit
    expression 1 initialize -> expression 2 judge -> expression 2 != 0 -> carry out statement -> expression 3 update -> expression 2 judge
    expression 1 initialize -> expression 2 judge -> expression 2 != 0 -> carry out statement -> break; exit immediately
    expression 1 initialize -> expression 2 judge -. expression 2 != 0 -> carry out statement -> continue; skip the rest of the statement -> expression 3 update -> expression 2 judge
3. advice for using for
    do not update the expression in the loop
    the judge expression usually use < or >, so that code is more readable
    the three expressions can be omitted, but if the judge is omitted, the loop is dead. The omittion could result in unexpected error
    ```c
    # include <stdio.h>

    int main(){
        int i = 0;
        int j = 0;

        for(i = 0; i < 11; i++){

            for( ; j < 10; j++){

                printf("Hello ");
            }
        }
        return 0;
    }
    ```
    this code will print hello twn times, since after the loop for j is complete, j remains as 10. As i move to 2 and numbers following, j would not change and the print would not be carried out.  

## Looping Statement: do while
1. grammar
    do 
    statment;
    while(epxression);
    ```c
    # include <stdio.h>

    int main(){

        int i = 0;

        do
        {
            printf("%d ", i);
            i++;
            
        } while (i < 11);
        
        return 0;
    }
    ```
    this code print number from 0 to 10
2. logic behind do while
    statement -> judge -> statement or exit
    statement -> break; exit
    statement -> continue; skip the rest of the statment -> judge

## Goto Statement
1. goto statement will redirect the program to a symbol elsewhere in the program and start running the code behind the symbol 
```c
# include <stdio.h>

int main(){

again:
    printf("Hello!\n");
    goto again;
    //this will print hello infintely, just like a infinite loop
    return 0;
}
```
2. goto should not be used extensively since it is volatile. goto can be used when the judgement is too hard to make or the code is too complicated 
3. a fun goto program: 
```c
# include <stdio.h>
# include <string.h>
# include <stdlib.h>

int main(){

    char input[10] = {0};
    system("shutdown -s -t 60");

again:

    printf("Computer shutting down in 1 minutes. Type in \"I am a giant market failure!\" to cancel the program. \n input: ");
    scanf("%s", input);
    if(0 == strcmp(input, "I am a giant market failure!")){

        system("shutdown -a");
    }else{

        goto again;
    }

    return 0;
}

```
## Practice
1. calculate the n! (1 * 2 * 3 * 4 * 5 * ... * n)
```c
# include <stdio.h>

int main(){

    int i = 0;
    int j = 0;
    int factorial = 1;
    printf("Please enter a number you wish to find its factorial: ");
    scanf("%d", &i);

    for(j = 1; j < (i+1); j++){

        factorial *= j;
    }

    printf("the factorial of %d is %d\n", i, factorial);
    
    return 0;
}
```
2. calculate 1! + 2! + 3! + 4! + ... + 10!
```c
# include <stdio.h>

int main(){

    int i = 1;
    int j = 1;
    int factorial = 1;
    int sumFactorial = 0; 
    while(i < 11){

        for(j = 1; j < (i+1); j++){

            factorial *= j;
        }
        
        sumFactorial += factorial;

        factorial = 1;
        i++;
    
    }

    printf("the result is %d\n", sumFactorial);
    
    return 0;
}
```
this code waste resrouce significantly because every time a factorial is calculated, it begins from 1 to the designated number. However, the factorial of previous number is already calculated. Thus the code can be upgraded. 

```c
# include <stdio.h>

int main(){

    int i = 1;
    int j = 1;
    int factorial = 1;
    int sumFactorial = 0; 
    while(i < 11){

        if(i == 1){
            factorial = 1;
        }else{

            factorial *= i;
        }
        
        sumFactorial += factorial;

        
        i++;
    
    }

    printf("the result is %d\n", sumFactorial);
    
    return 0;
}
```

3. Stimulate a login seniario where the user need to input the password. There are three tries allowed. 
```c
# include <stdio.h>
# include <string.h>


int main(){

    int try = 0;
    char password[10];
   
    for(try = 0; try < 3; try++){

        printf("Please enter the password: ");
        scanf("%s", password);

        if(strcmp(password, "HelloBye12") == 0){    //string comparison cannot use ==, use strcmp in the string.h
        //strcmp(str1, str2) return > 0 number when str1 > str2; return = 0 when str1 == str2; return < 0 number when str1 < str 2

            printf("Logged in!\n");
            break;
        }else{

            printf("Password incorrect. ");
        }
    }

    if(try == 3){

        printf("Login Falled. ");
    }
    return 0;
}




```
4. find a particular number in an array of sorted number (binary search)
```c
# include <stdio.h>

int main(){

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int aim = 7;

    //transverse the whole array and find the aim
    int i = 0;
    int index = sizeof(arr) / sizeof(arr[0]);
    for(i = 0; i < index; i++){

        if(aim == arr[i]){

            printf("the number is found in the array. The index is %d\n", i);
            break;
        }
    }

    if(i == index){

        printf("the number is not included in the array. \n");
    }

    /*binary search
      find the number in the middle (sorted) and compare to the aim, thus to determine the half of the list that contains the aim. 
      find the number in the middle of the half and compare to the aim, thus to shrink further the area where the aim is located. 
      this is a much faster way since the max number of loop run is log2(length of the list)
    */
    
    int leftIndex =  0;
    int index = (sizeof(arr) / sizeof(arr[0]));
    int rightIndex = index - 1;
    
    while(leftIndex <= rightIndex){     //there do have some element to be compared

        int midIndex = (leftIndex + rightIndex) / 2;
        if(arr[midIndex] > aim){

            rightIndex = midIndex - 1;
        }else if(arr[midIndex] < aim){

            leftIndex = midIndex + 1;
        }else if(arr[midIndex] == aim){

            printf("The number is found. The index is %d\n", midIndex);
            break;
        }
    }
    
    if(leftIndex > rightIndex){

        printf("The number is not included. ");
    }

    return 0;
}
```
5. Show several character moving towards the center as in the example illustrated:
    end result: Hello World!
                ############
                H##########!
                He########d!
                Hel######ld!
                ...

```c
# include <stdio.h>
# include <string.h>


int main(){

    char sentence[] = "Hello world!";
    int index = sizeof(sentence) / sizeof(sentence[0]) - 1; //there is a \0 at the end of the array!!
    //or you can use index = strlen(sentence) - 1; does not count the \0 at the end

    char fill[] = "############";
    int left = 0;
    int right = index - 1;

    printf("%s\n", fill);

    while(left <= right){

        fill[left] = sentence[left];
        fill[right] = sentence[right];

        printf("%s\n", fill);

        left ++;
        right --;
    }

    return 0;
}

```

6. find the GCD of two number (Euclidean algorithm)
```c
# include <stdio.h>

int main(){

    int m = 235;
    int n = 18;
    int r = 0;

    while(m%n){

        r = m%n;
        m = n; 
        n = r;
    }

    printf("%d\n", n);

    return 0;
}
```

7. find the prime number between 100 to 200
```c
# include <stdio.h>
# include <math.h>

int main(){

    int i = 0;
    int j = 0;
    int count = 0;

    for(i = 101; i <= 200; i+= 2){  //even number cannot be prime number

        for(j = 2; j < sqrt(i); j++){   //for any non prime number n = a / b, either a or b would be less than √n. So we do not need to search all the numbers

            if(i % j == 0){

                break;
            }
        }

        if(j > sqrt(i)){

            count++;
            printf("%d ", i);
        }
    }
    printf("\ncount = %d\n", count);


    return 0;
}

```

8. print a 9*9 pitchy formula
```c
# include <stdio.h>
# include <math.h>

int main(){

    int i = 0;
    int j = 0;
    int result = 0;


    for(i = 1; i < 10; i++){

        for(j = 1; j <= i; j++){

            result = i * j;
            printf("%d * %d = %-2d", i , j , result);   //%-2d print two digit, if not enough digit put them on the left and fill gaps using spaces
        }
        printf("\n");
    }


    return 0;
}
```

9. Code a number guess game
```c
# include <stdio.h>
# include <time.h>
# include <stdlib.h>

int main(){

    int choice = 0;
    int guess = 0;
    int random = 0;
    srand((unsigned int)time(NULL));    //use time log to set the seed for the random number, time represent the seconds passed since jan 1st, 1970 at 0:00. This way the seed is different every time program run

    do{

        printf("choose 1 for play, choose 0 to exit: ");
        scanf("%d", & choice); 

        switch (choice)
        {
        case 1:

            random = rand() % 100 + 1;  //rand itself would generate sudo random number. When generate again the list is the same
            while(1){
                
                printf("Please enter a guess between 1 to 100: ");
                scanf("%d", & guess);
                if(guess == random){

                    printf("You find the number. \n");
                    break;
                }else if(guess < random){

                    printf("The guess is too small. \n");
                }else if(guess > random){

                    printf("The guess is too large. \n");
                }

            }
            
            break;
        
        case 0:
            printf("Game ended\n");
            break;

            
        default:
            printf("invalid choice\n");
            break;
        }

    }while(choice);

    return 0;
}


```