package Java_learning;

import java.util.Scanner;

public class ObjectEx {
    /*
    define a class of circle
    define its necessary property
    define methods to find the circumference and area
    print out the results
    */
    /** radius of the circle */
    public double radius; 
    /** circumference of the circle */
    public double circumference;
    /** area of the circle */
    public double area;

    public ObjectEx(){
        userInRadius();
    }
    public ObjectEx(double radiusIn){
        if (radius > 0){
            radius = radiusIn;
        }else{
            userInRadius();
        }
    }
    private void userInRadius(){
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        radius = userIn.nextDouble();
        userIn.close();
        
    }

    public void outputCircumference(){
        if(radius == 0){
            System.out.println("Current radius is zero.");
            userInRadius();

        }
        circumference = 2* Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }

    public void outputArea(){
        if(radius == 0){
            System.out.println("Current radius is zero.");
            userInRadius();

        }
        area = Math.pow(radius , 2) * Math.PI;
        System.out.println("The area of the circle is: " + area);
    }
}
