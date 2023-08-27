// Design a program to calculate the volume of a sphere
// Input will be a single value, which is the radius of a sphere
// Output format will be something like " the radius of a sphere is xx, and the volume is xx"
// Some requirements: You should google how to get the PI value and you should write a function to do the calculation. 
// Don't put any volume calculation inside the main function. In main function, you should call a function like 'calculate_sphere_volume'.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calculate_sphere_volume(int radius);

int main(int argc, char**argv) {

    int radius = atoi(argv[1]);
    if (radius < 0) {
        printf("radius must be a positive number, please re-enter one");
        return -1;
    }
    double volume = calculate_sphere_volume(radius);
    printf("The radius of a sphere is %d, and the volume is %.2lf. \n", radius, volume);
   
    return 0;
}

double calculate_sphere_volume(int radius)
{
    double sphere_volume = radius * radius * M_PI;
    
    return sphere_volume;
}
