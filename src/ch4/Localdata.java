/**
 * @ClassName Localdata
 * @Description 使用java自带的LocalDate类来解释相关概念
 * @Author years
 * @Date 2021-01-23 下午1:47
 * @Version 1.0
 **/
package ch4;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Localdata {
   public static void main(String[] args){
       //1
       //使用静态工厂的方式来调用LocalDate的构造器（静态工厂概念可上网搜索或者查阅《Effective Java》）
       LocalDate Now = LocalDate.now();

       //2
       //访问器方法和更改器方法，访问器方法不会改变访问的对象，相反更改器方法可能改变对象
       System.out.println(Now);
       LocalDate aThousandDayLater =  Now.plusDays(1000); //访问器方法
       System.out.println(aThousandDayLater);

       GregorianCalendar someDay = new GregorianCalendar(2021,1,23);
       someDay.add(Calendar.DAY_OF_MONTH,1000);//更改器方法
       System.out.println(someDay.get(Calendar.YEAR)+"-"+someDay.get(Calendar.MONTH)+"-"+someDay.get(Calendar.DAY_OF_MONTH));
   }

}
