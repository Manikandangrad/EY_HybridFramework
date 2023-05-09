package day8;
// private can be accessed only inside a class.
// public can be accessed anywhere in a class,in a same package,and in another package.
// protected can be accessed in a class,in a same package and in another package with the help of inheritance.
// Default can be accessed only in a class and the class of a same package.
public class AccessModifiers {
    //Initialising the variables in Instance
    private String pri="Private";
    public String pub="Public";
    protected String pro="Protected";
     String def="Default";

     //Creating methods
    private String pri()
    {
        System.out.println("This method is Private");
        return pri;
    }
    public String pub()
    {
        System.out.println("This method is Public");
        return pub;
    }
    protected String pro()
    {
        System.out.println("This method is Protected");
        return pro;
    }
     String def()
    {
        System.out.println("This method is Default");
        return def;
    }

    //Creating Main method and Calling other methods
    public static void main(String[] args)
    {
        AccessModifiers acmodifiers=new AccessModifiers();
        System.out.println(acmodifiers.pri);
        System.out.println(acmodifiers.pub);
        System.out.println(acmodifiers.pro);
        System.out.println(acmodifiers.def);
        acmodifiers.pri();
        acmodifiers.pub();
        acmodifiers.pro();
        acmodifiers.def();
    }
}
