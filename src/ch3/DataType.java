/*
 *@author years
 *@date 2021-01-14
 * something about datatype
 */
package ch3;

public class DataType {
    public static void main(String[] args){
        //1
        //Double.POSITIVE_INFINITY 和 Double.NEGATIVE_INFINITY 可以直接判断是否相等，但是Double.Nan不等以任何数，需要使用Double.isNaN()
        System.out.println("*************(1)*************");
        double nan=Double.NaN,positive=Double.POSITIVE_INFINITY;
        System.out.println(nan==Double.NaN);
        System.out.println(Double.isNaN(nan));
        System.out.println(positive==Double.POSITIVE_INFINITY);

        //2
        //java的浮点计算无法实现精确计算，因为二进制系统无法精确表示1/10，就像十进制无法表示1/3，需要使用BigDecimal类实现精确计算
        System.out.println("*************(2)*************");
        System.out.println(2.0-1.1);

        //3
        //转义序列\\u 会在代码解析之前处理，先执行转义
        System.out.println("*************(3)*************");
        //例如\\u0022对应双引号，所以下面代码为 “”+“”输出为空，而不是输出“+”
        //并且就算在注释中，单引号u也会转义，00A0代表了换行，所以单行注释出现00A0转义就会出错，还有注释中斜杠+u开头的地址
        System.out.println("\"\\u0022+\\u0022\": "+"\u0022+\u0022");

    }
}