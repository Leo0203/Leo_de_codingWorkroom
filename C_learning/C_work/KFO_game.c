#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    //random function
    srand(time(NULL));
    int hp1 = 100, hp2 = 100;
    while (hp1 >= 0 && hp2 >= 0)
    {
        int att1 = rand() % 11 + 5; // to get a number between a and b use: rand() % (b - a + 1) + a
        if(att1 == 15)
        {
            att1 *= 2;
        }
        int att2 = rand() % 11 + 5;

        hp2 -= att1;
        hp1 -= att2;

        if (hp1 <= 0)
        {
            hp1 = 0;
            break;
        }

        printf("*********************************************\n");
        printf("Player 1 attack: %d, player 2 left health: %d \n", att1, hp2);
        printf("Player 2 attack: %d, player 1 left health: %d \n", att2, hp1);
        printf("*********************************************\n");

    }
    printf("KO! player 1 health: %d, player 2 health: %d. \n", hp1, hp2);
}
