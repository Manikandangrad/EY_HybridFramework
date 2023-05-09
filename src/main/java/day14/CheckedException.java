package day14;
//   ----Checked Exception (Exception shows before the execution)----
//    We will throw the Exception here...
public class CheckedException {
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
        return result;
    }

    public static void main(String[] args) throws Exception {
        CheckedException checkedException1 = new CheckedException();
        System.out.println(checkedException1.div(15,0));
    }
}
