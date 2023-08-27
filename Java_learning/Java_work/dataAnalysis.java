package Java_work;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
this program can:
sort a list, find the median, find quartile 1 and quartile 3, inter quartile range, variance and standard deviation
*/

public class dataAnalysis {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int elementsCount = 0;
        double median = 0; 
        double Q1, Q3, IQR, variance, standardDeviation, mean;
        double total = 0;
        System.out.print("The number of elements in the list: ");
        elementsCount = input.nextInt();
        double[] list = new double[elementsCount]; 
        
        for (int i = 0; i < elementsCount; i++){
            System.out.print("The " + (i+1) + " number: ");
            double elements = input.nextDouble();
            list[i] = elements;
        }

        for(int j = 0; j < elementsCount; j++){
            for(int x = 0; x < elementsCount - j - 1; x++){
                if(list[x] > list[x+1]){
                    double temp = list[x];
                    list[x] = list[x+1];
                    list[x+1] = temp;
                }
            }
        }

        //median = list[(elementsCount + 1)/2];

        for (int i = 0; i < elementsCount; i++){
            total += list[i];
            
        }
        
        mean = total / elementsCount;
        
        // double elementplace_notfinal = elementsCount * 0.25;
        // if(elementplace_notfinal)


        System.out.println("sorted list: ");
        for (int i = 0; i < elementsCount; i++){
            System.out.print(list[i] + " ");
            
        }
        System.out.println();
        System.out.println("the median is: " + median);
        System.out.println("the mean is: " + mean);
        

    }

    public static double[] LeasttoGreatest(double[] list, int NumofElement){

        double[] LeasttoGreatestList = new double[NumofElement];

        return LeasttoGreatestList;
    }

}


