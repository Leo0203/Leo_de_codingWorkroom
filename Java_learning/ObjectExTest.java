package Java_learning;

import java.util.Scanner;

public class ObjectExTest {

    public static void main(String[] args){

        Scanner userIn = new Scanner(System.in);
        
        System.out.print("Please enter a radius of the circle: ");
        double radius = userIn.nextInt();
        ObjectEx circle = new ObjectEx(radius);

        circle.show();
        
    }    
}

