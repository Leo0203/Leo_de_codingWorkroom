package Java_learning;

import java.util.Scanner;

public class LoopEx 
{
    public static void main(String args[])
    {
        // calculate the sum of 1 + 2 + 3 + 4 + ... + 100
        /*int i = 0;
        int sum = 0;
        while(i < 100)
        {
            sum = sum + (i + 1);
            i++;
        }
        System.out.println(sum);
        */


        //input a passcode: 3 times wrong -> exit
        int i = 0;
        int actualPassword = 1234567;
        int inputPassword;
        
        while(i <= 3)
        {   System.out.print("please enter your 7 digit password: ");
            Scanner input = new Scanner(System.in);
            inputPassword = input.nextInt();
            if (inputPassword != actualPassword)
            {
                i++;
                System.out.printf("the password is wrong, you have: %d chances to enter again.\n", 4-i);
            }
            else
            {
                System.out.println("You have successfully logged in.");
            }
        }

        

    }
}