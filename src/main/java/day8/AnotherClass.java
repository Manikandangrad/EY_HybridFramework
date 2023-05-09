package day8;

public class AnotherClass {
    public static void main(String[] args)
    {
        AccessModifiers acmodifiers=new AccessModifiers();
        System.out.println(acmodifiers.pub);
        System.out.println(acmodifiers.pro);
        System.out.println(acmodifiers.def);
        acmodifiers.pub();
        acmodifiers.pro();
        acmodifiers.def();
    }
}
