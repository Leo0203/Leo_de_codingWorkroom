package Java_work;

/*
 * 您正在尝试在五天中的一天安排一个活动。 您的工作是确定应该在哪一天安排活动，以便尽可能多的感兴趣的人能够参加。 
 * 输入:输入的第一行将包含一个正整数 N，代表有兴趣参加您的活动的人数。
 * 接下来的 N 行将每行包含一个人的可用性，使用一个字符代表第 1 天、第 2 天、第 3 天、第 4 天和第 5 天（按此顺序）。
 * 字符 Y 表示此人可以参加，句点 (.) 表示此人无法参加。
 * 
 * Sample Input 1
    3
    YY.Y.
    ...Y.
    .YYY.
    Output for Sample Input 1: 4
 * Sample Input 2
    5
    YY..Y
    .YY.Y
    .Y.Y.
    .YY.Y
    Y...Y
    Output for Sample Input 2: 2,5
 */

import java.util.*;

public class Main{

    public static void main(String[] args){

        //setup a scanner
        Scanner input = new Scanner(System.in);
        int numPeople = 0;

        //get number N so that we can set an array
        numPeople = input.nextInt();

        //string array that save each line as a element
        String[] schedule = new String[numPeople];
        /*
        2D array that save each character in a char like: 
            YY..Y
            .YY.Y
            .Y.Y.
            .YY.Y
            Y...Y
         */
        char[][] scheduleSeparate = new char[numPeople][5];
        
        //set both string array and char array up
        for(int i = 0; i < schedule.length; i++){

            schedule[i] = input.next();
        }

        for(int i = 0; i < schedule.length; i++){

            char[] scheduleTemp = schedule[i].toCharArray();

            for(int j = 0; j < 5; j++){

                scheduleSeparate[i][j] = scheduleTemp[j];
            }
            
        }

        //count array to store Y appearance in each column
        int[] count = new int[5];

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < schedule.length; j++){

                if(scheduleSeparate[j][i] == 'Y'){

                    count[i]++;
                }
            }
        }

        //find the date which has the most Y
        int highestIndex = -1;
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                if(count[i] < count[j]){

                    break;

                }else{

                    highestIndex = i + 1;

                }
            }
        }
        
        //create an array to store dates that all have the highest count of Y
        //output something like: 02005 meaning date 2 and 5 have the same and highest number of Y
        int[] highestIndexMult = new int[5];  

        for(int i = 0; i< 5; i++){

            if(count[i] == count[highestIndex - 1]){

                highestIndexMult[i] = i + 1;
            }
        }


        //find the non zero elements in highestIndexMult so that we can know the date
        int nonzeroIndexNum = 0;

        for(int i = 0; i < 5; i++){

            if(highestIndexMult[i] != 0){

                nonzeroIndexNum++;
            }
                
        }

        //save the date into a new array so that we can print them out
        //following the example for highestIndexMult, if highestIndexMult is 0,2,0,0,5 then nonzeroHighestIndex would be 2,5
        int[] nonzeroHighestIndex = new int[nonzeroIndexNum];

        for(int i = 0; i < nonzeroHighestIndex.length; i++){

            for(int j = 0; j < 5; j++){

                if(highestIndexMult[j] != 0){

                    nonzeroHighestIndex[i] = highestIndexMult[j];
                    highestIndexMult[j] = 0;
                    break;
                }
            }

        }

        //print the date in the format: date,date,date
        if(nonzeroHighestIndex.length >= 1){

            System.out.print(nonzeroHighestIndex[0]);

        }

        for(int i = 1; i < nonzeroHighestIndex.length; i++){

            System.out.print("," + nonzeroHighestIndex[i]);

        }


    }
}