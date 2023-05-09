package assignments;

public class Palindrome {
    public static void main(String[] args)
    {
       String a="maram";
       String rev="";
       for(int i=a.length()-1;i>=0;i--)
       {
           rev=rev+a.charAt(i);
       }
       if(rev.equals(a))
       {
           System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not a Palindrome");
       }
    }
}
