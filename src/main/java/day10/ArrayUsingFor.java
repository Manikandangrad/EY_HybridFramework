package day10;

public class ArrayUsingFor {

    public static void main(String[] args)
    {
        String ar[]=new String[5];
        ar[0]="America";
        ar[1]="Butan";
        ar[2]="Canada";
        ar[3]="Denmark";
        ar[4]="Egypt";

        for(int i=0;i< ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
