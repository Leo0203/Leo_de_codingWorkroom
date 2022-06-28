package Java_work.calendarAndGergorianCalendar;

import java.util.Calendar;

import Java_work.calendar;

public class main {
    public static void main(String args[]){

        //calendar是抽象类，一般由子类gregoriancalendar实现
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getClass().getSuperclass());
        //使用日历打印时间
        int year    = cal.get(Calendar.YEAR);
        int month   = cal.get(Calendar.MONTH) + 1;
        int day     = cal.get(Calendar.DATE);
        int hour    = cal.get(Calendar.HOUR);
        int minute  = cal.get(Calendar.MINUTE);
        int sec     = cal.get(Calendar.SECOND);
        int milsec  = cal.get(Calendar.MILLISECOND);

        System.out.println("The current time is: " );
        String time = String.format("%d-%d-%d---%d:%d:%d-%d", 
            year, month, day, hour, minute, sec, milsec        
        );

        System.out.println(time);


    }
}
