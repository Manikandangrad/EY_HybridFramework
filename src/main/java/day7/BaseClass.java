package day7;

public class BaseClass {
    public int c;
    public int add(int a,int b)
    {
        c=a+b;
       return c;
    }
    public int subtract(int a,int b)
    {
      c=a-b;
      return c;
    }
    public int multiply(int a,int b)
    {
      c=a*b;
      return c;
    }
    public static void main(String[] args)
    {
        BaseClass in=new BaseClass();
        int add=in.add(2,3);
        System.out.println(add);
        int sub=in.subtract(3,3);
        System.out.println(sub);
        int mul=in.multiply(4,3);
        System.out.println(mul);
    }
}
