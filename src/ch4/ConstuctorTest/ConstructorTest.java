/**
 * @ClassName ConstructorTest
 * @Description 程序清单 4-5 ConstructorTest/ConstructorTest.java
 * @Author years
 * @Date 2021-01-24 下午1:43
 * @Version 1.0
 **/
package ch4.ConstuctorTest;

import java.util.*;

public class ConstructorTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects 用Employee对象填充staff数组
        Employee[] staff = new Employee[3];

        //对应代码中的三种构造器
        staff[0] = new Employee("Harry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //print out information about all Employee objects 输出所有Employee对象的信息
        for(Employee e:staff){
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }


    }
}




class Employee{
    private static int nextID;

    private int id;
    private String name=""; //instance filed initialization 实例域初始化
    private double salary;

    //static initialization block 静态初始化块
    static {
        Random generator = new Random();
        // set nextID to a random number between 0 and 9999
        nextID = generator.nextInt(10000);
    }

    //object initialization block 对象初始化块
    {
        id = nextID;
        nextID++;
    }

    //three overloaded constructors 三种重载的构造器
    public Employee(String n,double s){
        name = n;
        salary = s;

    }

    public Employee(double s){
        //calls the Employee(String, double) constructor 调用Employee(String, double)构造器
        this("Employee #"+nextID,s);
    }

    //the default construct 默认构造器
    public Employee(){
        /*
         * name initialized to "" --see above
         * name 被初始化为“” 可以在上面看到
         *
         * salary not explicitly set--initialized to 0
         * salary没有明确的设定--默认初始化为0
         *
         * id initialized in initialization block
         * id 已经在初始化块中被初始化了
         */
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
