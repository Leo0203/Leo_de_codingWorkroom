package Java_work;

import java.util.Scanner;

public class calendar {

    public static int year = Integer.MIN_VALUE;
    public static int month = Integer.MIN_VALUE;
    public static int [] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main (String[] args){
        
        userInYearandMonth();
        int sum = DayofYearNum(year);
        sum += DayInMonthNum();
        sum ++; // to push the date to the next month
        PrintMonthName();
        PrintCalendar(sum % 7);
    }

    /**
     * print the content of the calendar 
     * @param dayofWeek represent the position of the first day
     */
    public static void PrintCalendar(int dayofWeek){

        int  SeperatorCount = 0;//number of \t
        if(dayofWeek == 0){
            SeperatorCount = 6;

        }else{
            SeperatorCount = (dayofWeek - 1);
        }

        for(int  i = 0; i < SeperatorCount; i++){
            System.out.print("\t\t");
        }
        for(int i = 0; i < dayOfMonth[month - 1]; i++){
               System.out.print(i + 1);
               if((dayofWeek + i) % 7 == 0){
                   //this is a sunday
                   System.out.println();
               }else{
                   System.out.print("\t\t");
               }

        }

        System.out.println();
    }

    /**
     * to record the year and month inputted
     */
    private static void userInYearandMonth(){
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter a year after 1900: ");
        year = userIn.nextInt();
        System.out.print("Please enter a month: ");
        month = userIn.nextInt();
    }
    
    /**
     * get the number of days from 1900 to the inputed year 
     * @param year
     * @return sum
     */
    private static int DayofYearNum(int year){
        int sum = 0;

        if(year == Integer.MIN_VALUE){
            System.out.println("Year ivalid.");
            userInYearandMonth();
        }
        for(int i = 1900; i < year; i++){
            sum += 365;
            if(IsLeapYear(i)){
                sum++;
            }
        }

        return sum;
    }

    /**
     * to determine whether the year inputed a leapyear
     * @param year
     * @return true if it is a leap year
     */
    private static boolean IsLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    /**
     * find the number of days in the last month
     * @return
     */
    private static int DayInMonthNum(){
        
        int sum = 0;
        for(int i = 0; i < month - 1; i++){
            sum += dayOfMonth[i];
            
        }
        if(IsLeapYear(year) && month >= 3){
            sum++;
        }
        return sum;
    }

    /**
     * print the title of the clendar
     */
    private static void PrintMonthName(){

        String[] monthName = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
        //String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("\t\t\t\t\t" + year + "\t" + monthName[month - 1]);
        // for(int i = 0; i < dayName.length; i++){
        //     System.out.print(dayName[i] + "\t");
        // }
        System.out.println("Monday" + "\t\t" + "Tuesday" + "\t\t" + "Wednesday" + "\t" + "Thursday" + "\t" + "Friday" + "\t\t" + "Saturday" + "\t" + "Sunday" );
        System.out.println();
    }

}
