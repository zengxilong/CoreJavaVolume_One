/*
 *@author years
 *@date 2021-01-16
 *Variable
 */

package ch3;

public class Variable {
    public static final double CM_PER_INCH=2.54;
    public static void main(String[] args){
        //1
        //java的变量以字母开头，但是字母的范围非常广，例如‘A‘～’Z‘，’_‘,'$'，但是$只用在java编译器和其他工具生成的代码中。
        //查看这个字母是否可以用于变量名，可以使用Character类中的isJavaIdentifierStart和isJavaIdentifierPart判断
        System.out.println("*************(1)*************");
        System.out.println("$:"+Character.isJavaIdentifierPart('$'));
        System.out.println("@:"+Character.isJavaIdentifierPart('@'));

        //2
        //利用final来指示常量，习惯上常量全大写，如果在一个类中需要被多个方法使用，可以用 static final
        System.out.println("*************(2)*************");
        System.out.println(CM_PER_INCH);

    }
}
