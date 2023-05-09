package day14;
// Combinations:
//  *try is possible with one or multiple catches
//  *try is possible without any catch if finally is available
//  *try is not possible without any catch or finally
public class UncheckedException2 {
    public static void main(String[] args) {
//        Exception (Common for all errors)
        try
        {
            String a[] = new String[3];
            a[3] = "Manikandan";
            String b = null;
            System.out.println(b.length());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Execute Anyways");
        }
        System.out.println("Hello World");
    }
}
