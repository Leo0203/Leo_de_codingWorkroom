package Java_learning;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class ObjectEx {
    /*
    define a class of circle
    define its necessary property
    define methods to find the circumference and area
    print out the results
    */
    /** radius of the circle */
    private double radius; 
    /** circumference of the circle */
    private double circumference;
    /** area of the circle */
    private double area;


    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){

        if(radius <= 0){    //benefit of encapsulation: to have default value and easy to make changes -> avoid errors
            radius = 0;
        }
        this.radius = radius;
    }
    
    public double getCircumference() {
        circumference = 2* Math.PI * radius;
        return circumference;
    }

    public double getArea() {
        area = Math.pow(radius , 2) * Math.PI;
        return area;
    }

    public ObjectEx(double radius) {
        this.setRadius(radius);
    }

    public ObjectEx(){

    }
    
    public void show(){
        System.out.println("The area of the circle is: " + this.getArea());
        System.out.println("The circumference of the circle is: " + this.getCircumference());
    }
        

    /*
        public, private, protected, default
    */
    }

