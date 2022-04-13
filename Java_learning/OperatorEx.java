package Java_learning;

import java.util.Scanner;

public class OperatorEx {
    
    /*
    this program can covert a certain amount of money to some changes
    */
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Thank you for using this changemaker, please enter the amount you want to convert into change:");
        double total = input.nextDouble();
        int dollar = (int)total;
        int cent = ((int)(total * 100)) % 100;
        int numOf50dollar = dollar / 50;
        int numOf10dollar = (dollar - 50*numOf50dollar) / 10;
        int numOf05dollar = dollar % 10 / 5;
        int numOf02dollar = (dollar % 10 - 5*numOf05dollar) / 2;
        int numOf01dollar = (dollar % 10 - 5*numOf05dollar - 2*numOf02dollar) / 1;
        int numOf50cent   = cent / 50;
        int numOf25cent   = (cent - 50*numOf50cent) / 25;
        int numOf10cent   = (cent - 50*numOf50cent - 25*numOf25cent) / 10;
        int numOf05cent   = cent % 10 / 5;
        int numOf01cent   = (cent % 10 - 5*numOf05cent);
        System.out.println("You can get"+ numOf50dollar + "$50");
        System.out.println("And "+ numOf10dollar + " $10");
        System.out.println("And "+numOf05dollar + " $5");
        System.out.println("And "+numOf02dollar + " $2");
        System.out.println("And "+numOf01dollar + " $1");
        System.out.println("And "+numOf50cent + " ¢50");
        System.out.println("And "+numOf25cent + " ¢25");
        System.out.println("And "+numOf10cent + " ¢10");
        System.out.println("And "+numOf05cent + " ¢5");
        System.out.println("And "+numOf01cent + " ¢1");

        
    }
}