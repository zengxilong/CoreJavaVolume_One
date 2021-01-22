/**
 * @ClassName BigValue
 * @Description ch3.9 大数值
 * @Author years
 * @Date 2021-01-22 下午7:00
 * @Version 1.0
 **/
package ch3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigValue {
    public static void main(String[] args){
        //1
        //java.math中BigInteger & BigDecimal表示大数
        System.out.println("*************(1)*************");
        BigInteger Inta = BigInteger.valueOf(99999999);
        Inta = Inta.multiply(BigInteger.valueOf(55)); //java没有操作符重载功能，四则运算为add,subtract,multiply,divide以及取余mod，比较compareTo
        System.out.println("Inta: "+Inta);

        //2
        //BigDecimal的divide必须指定舍入模式，常用的四舍五入为RoundingMode.HALF_UP，并且valueof可以传入二个参数long x, int scale,返回 x/(10**scale)
        System.out.println("*************(2)*************");
        BigDecimal DecA = BigDecimal.valueOf(456,4);
        System.out.println(DecA);
        System.out.println(DecA.divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP));

    }
}
