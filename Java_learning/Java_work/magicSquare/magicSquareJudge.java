package Java_work.magicSquare;

import java.io.*;
import java.util.*;

/*
 * the program is to determine the magic square. 
 * The magic square is a square of number that the sum of each row, column and two diagonals are equal
 */
public class magicSquareJudge{
    public static void main(String[]args)throws IOException{

        Scanner input=new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the square with amount of number as the first row: ");

        // String fileName=input.nextLine();
        // Scanner reader=new Scanner(new File(fileName));

        int size = input.nextInt();
        int array[][]=new int[size][size];
        for(int i = 0; i < size; i++){
            
            for(int j = 0; j < size; j++){

                array[i][j] = input.nextInt();
            }
        }
        

        boolean isRow = sumOfRow(array, size);
        boolean isColumn = sumOfColumn(array, size);
        boolean isDiagonal = SumOfDiagonal(array, size);
        
        if(isRow && isColumn && isDiagonal){

            System.out.println("This is a magic square.");
            for(int i = 0; i < size; i++){

                sum += array[0][i];
            }
            System.out.println("The magic sum is: " + sum);
        }else{

            System.out.println("This is not a magic square.");
        }
        
        
        
    }

    public static boolean sumOfRow(int square [][], int size){

        int[] sum = new int[size];
        int sumSingle = 0;

        for(int i = 0; i < size; i++){  //loop the row

            for (int j = 0; j < size; j++){ //loop the column

                int element = square[i][j];
                sumSingle += element;

            }

            sum[i] = sumSingle;
            sumSingle = 0;
        }



        for(int i = 0; i < (size - 1); i++){

            if(sum[i] != sum[i + 1]){
                
                return false;
            }
        }
        
        return true;
    }

    public static boolean sumOfColumn(int square [][], int size){

        int[] sum = new int[size];
        int sumSingle = 0;

        for(int i = 0; i < size; i++){  //loop the column

            for (int j = 0; j < size; j++){ //loop the row

                int element = square[j][i];
                sumSingle += element;

            }

            sum[i] = sumSingle;
            sumSingle = 0;
        }


        for(int i = 0; i < (size - 1); i++){

            if(sum[i] != sum[i + 1]){
                
                return false;
            }
        }
        
        return true;
    }

    public static boolean SumOfDiagonal(int square[][], int size){

        int[] sum = new int[2];
        int sumSingle = 0;

        for(int i = 0; i < size; i++){

            int element = square[i][i];

            sumSingle += element;
            
        }
        sum[0] = sumSingle;
        sumSingle = 0;

        for(int i = (size - 1); i > -1; i--){

            int j = (size - 1) - i;
            int element = square[j][i];

            sumSingle += element;
                
            
        }
        sum[1] = sumSingle;


        if(sum[0] == sum[1]){
            return true;
        }


        return false;
    }

}