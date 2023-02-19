package Java_work;

import java.util.Scanner;

public class odddSum {
    
    public static void main(String[] args){

        int num = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number: ");
        num = input.nextInt();

        if(num > 0){
            result = oddSumPositive(num);
        }else{
            result = oddSumNegetive(num);
        }

        System.out.println(result);

    }

    public static int oddSumPositive(int num){
        int result = 1;
        int odd = 3;
        while(num >= odd){
            result =result + odd;
            odd = odd+ 2;
            
        }
        return result;
    }

    public static int oddSumNegetive(int num){
        int result = 1;
        int odd = -1;
        while(num <= odd){
            result =result + odd;
            odd = odd - 2;
            
        }
        return result;
    }
}
