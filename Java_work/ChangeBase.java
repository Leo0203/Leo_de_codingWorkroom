package Java_work;

/*
    input: a base 10 number
    output: a base 2, 8, 16, 32 number
    input output can also swap
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java. util. Scanner;

public class ChangeBase {
    public static void main(String[] args){

        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter a base 10 number: ");
        int Base10Num = userIn.nextInt();
        System.out.println(Base10toBase16(Base10Num));
        



    }
/**
 * change a base 10 number to base 16 number
 * @param Base10Num a base 10 number
 * @return a string representing the base 16 number
 */
    public static String Base10toBase16(int Base10Num){
        
        String Base16Num = "";
        while(Base10Num != 0){
            int temp = Base10Num % 16; //get the reminder (0-15)
            if(temp >= 0 && temp <= 9){
                Base16Num = temp + Base16Num; //every reminder is added from the beginning
            }else if(temp >= 10 && temp <= 15){
                //change the reminder to character (A-F)
                Base16Num = (char)(temp - 10 + 'A') + Base16Num;  
            }
            
            Base10Num /= 16;
        }
        return Base16Num;
    }
/**
 * change a base 16 number to base 10 number
 * @param Base16Num a base 16 number
 * @return a base 10 number
 */
    public static int Base16toBase10(String Base16Num){

        int Base10Num = 0;
        
        //6E -> 6 * 16^1 + 14 * 1
        // num * 16^(n-1)
        for(int  i = 0; i < Base16Num.length(); i++){
            char temp = Base16Num.charAt(i); //temp could be 0 - 9  or A - F
            //when the first element is i, the last element is length - 1 - i
            if(temp >= '0' && temp <= '9'){
                Base10Num += (temp - '0') * Math.pow(16, Base16Num.length() - 1 - i);
            }else if(temp >= 'A' && temp <= 'F'){
                Base10Num += (temp - 'A' + 10) * Math.pow(16, Base16Num.length() - 1 - i); 
            }
            
        }

        return Base10Num;

    }
    
}
