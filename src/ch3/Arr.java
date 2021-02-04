/**
 * @ClassName Arr
 * @Description 3.10数组
 * @Author years
 * @Date 2021-01-22 下午7:29
 * @Version 1.0
 **/
package ch3;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        //1
        //数字数组初始化为0，boolean为false，对象数组为null，
        System.out.println("*************(1)*************");
        String[] names= new String[10]; //全为null
        for(int i = 0;i < names.length;i++){
            names[i] = "";
        }//全为空串
        //2
        //数组初始化
        System.out.println("*************(2)*************");
        int[] smallPrimers = {2,3,4};
        smallPrimers = new int[] {1,2,3,4,5,6};

        //3
        //允许数组长度为0，这与null不同
        System.out.println("*************(3)*************");
        int[] zero = new int[0];

        //4
        //数组拷贝，直接使用=将会使得两个数组变量引用同一个数组，如果只希望复制数组的值，要使用Arrays.copyOf
        System.out.println("*************(4)*************");
        int[] Prim = {0,1,2,3,4};
        int[] copy = Prim;
        int[] notCopy = Arrays.copyOf(Prim,Prim.length * 2); //第二个参数为新的数组长度，超出的部分与数组初始化内容相同
        Prim[1] = 99; //修改Prim，会修改copy

        for(int i:Prim) System.out.print(i+" ");
        System.out.println();
        for(int i:copy) System.out.print(i+" ");
        System.out.println();
        for(int i:notCopy) System.out.print(i+" ");
        System.out.println();

        //5
        //优化版快排算法
        System.out.println("*************(5)*************");
        Arrays.sort(Prim);
        for(int i:Prim) System.out.print(i+" ");
        System.out.println();

        //6
        //for each在多维数组的用法
        System.out.println("*************(6)*************");
        int[][] magicSquare = {
                {1,2,56,1,2},
                {11,22,44,11,87},
                {8,5,3,1,23}
        };

        for(int[] row:magicSquare){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        //Arrays.deepToString可以快速打印
        System.out.println(Arrays.deepToString(magicSquare));

        //7
        //不规则数组
        System.out.println("*************(7)*************");
        //交换两行
        int[] tmp = magicSquare[0];
        magicSquare[0] = magicSquare[1];
        magicSquare[1] = tmp;
        //output
        for(int[] row:magicSquare){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        //倒下三角矩阵（不规则数组）

        int[][] odds = new int[6][];
        for(int n =0;n<6;n++){
            odds[n] = new int[n+1];
        }

        //访问这个数组
        for(int n =0;n<odds.length;n++)
            for (int k =0;k<odds[n].length;k++){
                //something to do
            }


    }

}
