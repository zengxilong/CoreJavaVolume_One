/**
 * @ClassName StaticTest
 * @Description 程序清单 4-3 StaticTest/StaticTest.java
 * @Author years
 * @Date 2021-01-23 下午8:33
 * @Version 1.0
 **/
package ch4.StaticTest;

import java.time.LocalDate;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom",40000);
        staff[1] = new Employee("Dick",60000);
        staff[2] = new Employee("Harry",65000);


        for(Employee e:staff){
            e.setId();
            System.out.println("anme="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        int n = Employee.getNextID();
        System.out.println("Next available id="+n);
    }

}

class Employee{

    private static int nextID = 1;

    private String name;
    private double salary;
    private int  id;

    public Employee(String n,double s){
        name = n;
        salary = s;
        id = 0;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
