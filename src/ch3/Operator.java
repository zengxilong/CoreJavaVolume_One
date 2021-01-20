package ch3;

enum Size {S,M,L,X};

public class Operator {
    public static void main(String[] args){
        //1
        //math类floorMod方法解决了取模运算时，被除数小于0的问题，在java默认操作符%中，如果被除数小于0，那么返回-1
        //比如时钟问题 (pos+adj)%12可能得到-1，必须要写成((pos+adj)%12+12)%12
        System.out.println("*************(1)*************");
        System.out.println(Math.floorMod(-1,12));

        //2
        //Math类还有常见的三角函数，指数函数，对数函数，以10为底的对数，以及pi和e近似值
        System.out.println("*************(2)*************");
        System.out.println(Math.exp(1)==Math.E);
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(100));
        System.out.println(Math.log1p(100));    //ln(1+x)

        //3
        //int-->float , long-->float , long-->double 可能会造成精度丢失
        System.out.println("*************(3)*************");
        int n=123456789;
        float f = n;
        System.out.print("n: "+n+"\nf: "+f);

        //4
        //强制类型转换可能会丢失一些信息，如果是对浮点数进行舍入运算，可以使用Math.round进行四舍五入
        double x =9.74;
        int nx = (int) Math.round(x); //注意返回值为long类型，需要强制转换

        //5
        //枚举类型的用法
        //在类外定义enum Size {S,M,L,X};
        Size s = Size.S;
        Size nu = null;

    }

}
