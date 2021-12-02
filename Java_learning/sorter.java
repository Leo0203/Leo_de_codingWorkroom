package Java_learning;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sorter {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int elementsCount = 0;
        System.out.print("The number of elements in the list: ");
        elementsCount = input.nextInt();
        double[] list = new double[elementsCount]; 
        
        for (int i = 0; i < elementsCount; i++){
            System.out.print("The " + i + " number: ");
            double elements = input.nextDouble();
            list[i] = elements;
        }

        for(int j = 0; j < elementsCount - 1; j++){
            for(int x = 1; x < elementsCount - j - 1; x++){
                if(list[x] > list[x+1]){
                    double temp = list[x];
                    list[x] = list[x+1];
                    list[x+1] = temp;
                }
            }
        }

        System.out.println("sorted list: ");
        for (int i = 0; i < elementsCount; i++){
            System.out.print(list[i] + " ");
            
        }
    }

}
