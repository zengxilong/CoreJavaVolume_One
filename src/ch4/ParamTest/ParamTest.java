/**
 * @ClassName ParamTest
 * @Description 程序清单 4-4 ParamTest/ParamTest.java
 * @Author years
 * @Date 2021-01-24 下午1:01
 * @Version 1.0
 **/
package ch4.ParamTest;

import java.time.LocalDate;

public class ParamTest {
    public static void main(String[] args) {

        /*
         * Test1: Methods can't modify numeric parameters
         * 测试1：方法不能修改一个基本数据类型的参数（数值型or布尔型）
         */

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent = "+percent);
        tripleValue(percent);
        System.out.println("After: percent = "+percent);

        /*
         * Test2: Methods can change the state of object parameters
         * 测试2： 方法能修改对象参数的状态
         */

        System.out.println("\nTesting tripleSalary");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before: salary = "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = "+harry.getSalary());

        /*
         * Test3: Methods can't attach new objects to object parameters
         * 测试3： 方法不能让对象参数引用一个新的对象
         */

        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",60000);
        System.out.println("Before: a = "+a.getName());
        System.out.println("Before: b = "+b.getName());
        swap(a,b);
        System.out.println("After: a = "+a.getName());
        System.out.println("After: b = "+b.getName());
    }

    public static void tripleValue(double x){// doesn't work!
        x = 3 * x;
        System.out.println("End of method: x = "+x);
    }

    public static void tripleSalary(Employee x){// work!
        x.raiseSalary(200);
        System.out.println("End of method: x = "+x.getSalary());
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = "+x.getName());
        System.out.println("End of method: y = "+y.getName());
    }
}


class Employee //Simplified Employee Class
{
    private String name;
    private double salary;


    public Employee(String n,double s){
        name = n;
        salary = s;

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double percent){
        salary += (salary * percent / 100);
    }

}

