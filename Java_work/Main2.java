

import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numPeople = 0;

        numPeople = input.nextInt();

        String[] schedule = new String[numPeople];
        char[][] scheduleSeparate = new char[numPeople][5];
        

        for(int i = 0; i < schedule.length; i++){

            schedule[i] = input.next();
        }

        for(int i = 0; i < schedule.length; i++){

            char[] scheduleTemp = schedule[i].toCharArray();

            for(int j = 0; j < 5; j++){

                scheduleSeparate[i][j] = scheduleTemp[j];
            }
            
        }

        int[] count = new int[5];

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < schedule.length; j++){

                if(scheduleSeparate[j][i] == 'Y'){

                    count[i]++;
                }
            }
        }

        for(int i = 0; i < 5; i++){

            if(count[i] == 5){

                System.out.println(i + 1);
            }
        }

    }
}