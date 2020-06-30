# include <stdio.h>
# include <stdlib.h>
# include <math.h>

double circle (double radius);   //area of circle
int vaildate (double);           //to confirm the input is a positive number

int main()
{
    double radius = 0;
    double area = 0;
    printf("Please enter the radius for your circle: ");
    do
    {
       scanf("%lf", & radius); 
       if (!vaildate(radius))       //if is not a positive number, print 
       {
           prinf("The number cannot be a negative number, please try another one: ");
       }
    } while (!vaildate(radius));    //redo scanf is here is true
    area = circle(radius);
    printf("The area is %.2lf\n", area);
}

double circle(double radius)
{
    double area = M_PI * pow(radius, 2);
    return area;
}
int vaildate (double num)
{
    return num > 0;       //if num > 0, return a number which is not 0, which means true.
}