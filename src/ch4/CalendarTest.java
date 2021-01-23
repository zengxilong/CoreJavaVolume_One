/**
 * @ClassName CalendarTest
 * @Description 程序清单4-1 CalendarTest/CalendarTest.java
 * @Author years
 * @Date 2021-01-23 下午2:03
 * @Version 1.0
 **/
package ch4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth(); //后面会将date设置为本月开头，这里先保存今天的数据

        date = date.minusDays(today-1); //今天减去 today-1 就是这个月的第一天，today是今天在这个月中的天数
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); //获取到本月第一天是星期几

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for(int i =1 ; i<value;i++){ //将上一个月的日期空出来，也就是不显示与本月第一天同一个星期的上一个月的日期
            System.out.print("    ");
        }

        while (date.getMonthValue()==month){//将这个月输出完
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1) System.out.println(); //周日+1之后是周一，需要换行

        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();
    }
}
