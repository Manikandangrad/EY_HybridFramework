package day3;

public class Variables {

// Class or Static Variable
    //Can be accessed in both Instance and Local methods.
    public static int a=1;

//Instance Variable
    public int b=2;
    public int Increment()
    {
        return a+b;
    }

    public static void main(String[] args)
{
    //Local Variable
    //Can be accessed only inside the local method.
    int c=3,d=4;

    //Output for Local Variable
    System.out.println("Local Variable");
    System.out.println(c+d);

    Variables variables=new Variables();

    //Output for Instance Variable
    System.out.println("Instance Variable");
    System.out.println(variables.b);
    System.out.println(variables.Increment());

    //Output for Class Variable
    System.out.println("Class Variable");
    System.out.println(Variables.a);
    System.out.println(a+c+d);
}

}
