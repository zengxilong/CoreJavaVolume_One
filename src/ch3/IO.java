/**
 * @ClassName IO
 * @Description IO
 * @Author years
 * @Date 2021-01-21 下午1:42
 * @Version 1.0
 **/
package ch3;
import java.io.*;

import java.nio.file.Paths;
import java.util.*;
public class IO {
    public static void main(String[] args) throws IOException {
        //1
        //构造Scanner对象与System.in关联
        System.out.println("*************(1)*************");
        Scanner in = new Scanner(System.in);

        System.out.println("What is you name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello "+name+". Next year you'll be "+(age+1));

        //2
        //文件输出使用PrintWriter
        PrintWriter out = new PrintWriter("myfile.txt","UTF-8");
        out.println("hello!");
        out.write("write!");
        out.append("append!");
        out.close();

        //3
        //Scanner读取文件
        Scanner Fin = new Scanner(Paths.get("myfile.txt"),"UTF-8");
        System.out.println(Fin.next());
        System.out.println(Fin.next());
        Fin.close();
    }
}
