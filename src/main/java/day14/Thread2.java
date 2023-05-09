package day14;
public class Thread2 {
    public int div(int num1, int num2) throws Exception {
        int result;
        if(num2==0)
        {
            throw new Exception("Zero is not allowed");
        }
        else
        {
            result=num1/num2;
        }
        try {
            Thread.sleep(-1);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Thread2 thread = new Thread2();
        System.out.println(thread.div(15,5));
    }
}
