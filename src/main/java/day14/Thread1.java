package day14;
// When we use the Thread.sleep(), It will make delay for sometimes.
public class Thread1 {
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
        java.lang.Thread.sleep(5000);
        return result;
    }
    public static void main(String[] args) throws Exception {
        Thread1 thread = new Thread1();
        System.out.println(thread.div(15,5));
    }
}
