package day2;

import day7.BaseClass;

public class Objects {
    public static void main(String[] args)
    {
        BaseClass in = new BaseClass();
        int add=in.add(2,3);
        System.out.println(add);
        int sub=in.subtract(3,3);
        System.out.println(sub);
        int mul=in.multiply(4,3);
        System.out.println(mul);
        int multiply = in.multiply(in.add(2, 3), 5);
        System.out.println(multiply);
    }
}
