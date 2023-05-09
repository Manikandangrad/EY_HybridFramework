package day9;

public class Polymorphism {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public String addString()
    {
        String a="Ram",b="Kiran";
        return a+b;
    }
    public static void main(String[] args)
    {
        Polymorphism polymorphism=new Polymorphism();
        System.out.println(polymorphism.add(1,2));
        System.out.println(polymorphism.add(3,4,5));
        System.out.println(polymorphism.add(10.2,20.2));
        System.out.println(polymorphism.addString());
    }
}
