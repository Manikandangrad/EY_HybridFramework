package day7;

public class DerivedClass extends BaseClass  {
    public static double squareRoot(int a)
    {
        double sqrt=Math.sqrt(a);
        return sqrt;
    }
    public static double power(int a,int b)
    {
        double pow=Math.pow(a,b);
        return pow;
    }
    public static void main(String[] args)
    {
        DerivedClass derivedClass=new DerivedClass();
        int add=derivedClass.add(3,3);
        System.out.println(add);
        int sub=derivedClass.subtract(4,4);
        System.out.println(sub);
        int mul=derivedClass.multiply(5,5);
        System.out.println(mul);
        double sqrt=DerivedClass.squareRoot(16);
        System.out.println(sqrt);
        double pow=DerivedClass.power(2,3);
        System.out.println(pow);

    }
}
