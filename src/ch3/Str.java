/**
 * @ClassName Str
 * @Description Str
 * @Author years
 * @Date 2021-01-21 下午1:42
 * @Version 1.0
 **/
package ch3;

public class Str {
    public static void  main(String[] args){
        //1
        //子串，param 1:起始位置，param 2:长度
        System.out.println("*************(1)*************");
        String greeting="Hello";
        String s = greeting.substring(0,3);
        System.out.println(s);

        //2
        //String.join 实现多字符串用指定定界符拼接
        System.out.println("*************(2)*************");
        String all=String.join("/","S","M","L","X");
        System.out.println(all);

        //3
        //String为不可修改字符串，只能整体修改字符串变量，而不能其中的字符进行修改
        System.out.println("*************(3)*************");
        String h = "Hello";
        h = h.substring(0,3)+"p!";
        System.out.println(h);

        //4
        //判断字符串是否相等，用equals，一定不能用==，（原因在文档中解释）
        System.out.println("*************(4)*************");
        System.out.println(greeting=="Hello");
        System.out.println(greeting.substring(0,3)=="Hel");
        System.out.println(greeting.substring(0,3).equals("Hel"));

        //5
        //判断一个字符串既不是null也不是空串(先判断null，因为不可以在null上调用方法)
        System.out.println("*************(4)*************");
        if(greeting!=null && greeting.length()!=0){
            System.out.println("Nice");
        }

        //6
        //一个码点对应Unicode 代码空间中的一个值，而代码单元表示在具体编码形式中的最小单位，一个码点对应单个或者多个代码单元
        System.out.println("*************(5)*************");
        String cp="\uD835\uDD46123";
        System.out.println("CodePoint: "+cp.codePointCount(0,cp.length())+"\nCodeUnit: "+cp.length());

        //7
        //使用charAt可能无法实现遍历码点，因为charAt是返回代码单元，所以可以使用codePoints方法
        System.out.println("*************(6)*************");
        System.out.print(cp+": ");
        int[] codePoints=cp.codePoints().toArray();
        for(int i:codePoints){//码点遍历
            System.out.print(i+" ");
        }
        System.out.println("");

        String str=new String(codePoints,0,codePoints.length); //根据码点数组构造字符串

        //8
        //在需要由多个较短字符串生成字符串时，用+连接效率低下，每一个+都会生成一次字符串，这里使用StringBuilder
        System.out.println("*************(6)*************");
        StringBuilder builder=new StringBuilder();
        builder.appendCodePoint(120134);//添加码点
        builder.append('1');//添加字符（代码单元）
        builder.append("23");//添加字符串
        builder.append(999);//添加数字
        String buildString = builder.toString();
        System.out.println(buildString);

    }
}
