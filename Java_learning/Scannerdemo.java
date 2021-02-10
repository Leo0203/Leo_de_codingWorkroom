package Java_learning;

import java.util.Scanner;

public class Scannerdemo {

    public static void main(String[] args)
    {
        double radius, Area;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle:");
        radius = scanner.nextDouble();
        Area = 3.14 * radius * radius;
        System.out.printf("The area of the circle is: %.2f\n", Area);

        /*
        if we are scanning char:
        java.util.Scanner scanner = new Scanner(System.in);
        char name = scanner.next().charAt(0);
        charAt(index) mean take in first (index) char character
        */
    }
    
}
