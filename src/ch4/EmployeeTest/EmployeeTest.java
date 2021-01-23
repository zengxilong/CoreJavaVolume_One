/**
 * @ClassName EmployeeTest
 * @Description 程序清单 4-2 EmployeeTest/EmployeeTest.java
 * @Author years
 * @Date 2021-01-23 下午3:45
 * @Version 1.0
 **/
package ch4.EmployeeTest;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建一个Employee对象数组
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);

        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for(Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
        }
    }

}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double percent){
        salary += (salary * percent / 100);
    }

}
