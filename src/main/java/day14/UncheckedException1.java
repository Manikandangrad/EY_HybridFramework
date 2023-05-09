package day14;
// Exception Handling occurs during the execution of the program.
// It breaks the execution and shows error.
// There are two Types.
//     *Checked Exception (Exception shows before the execution)
//     *UnChecked Exception (Exception shows at the time of execution)
public class UncheckedException1 {

    public static void main(String[] args) {

//  -----Unchecked Exception (Exception shows at the time of execution)-----

//        ArrayIndexOutOfBoundsException
        try {
            String a[]=new String[3];
            a[3]="Mani";
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        System.out.println("Hello");

//        NullPointerException
        try {
            String b = null;
            System.out.println(b.length());
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        }
        System.out.println("Hii");
    }
}
