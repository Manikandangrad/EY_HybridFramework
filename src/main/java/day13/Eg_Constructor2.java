package day13;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Eg_Constructor2 extends Eg_Constructor1 {
    public static void main(String[] args) {
        Eg_Constructor1 eg1 = new Eg_Constructor1("Ram","Kulasekharam","Kanniyakumari","Tamilnadu",1234567890);
        Eg_Constructor1 eg2 = new Eg_Constructor1("Rana","Kurunthencode","Kanniyakumari","Tamilnadu",1345678902);

        //        Listing the Details using Map
        Map<String, Eg_Constructor1> ad = new TreeMap<>();
        ad.put("Ram",eg1);
        ad.put("Rana",eg2);

//        Get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name whom you are looking for:");
        String userinput=scanner.next();

//        Display the input given by the user
        System.out.println(ad.get(userinput).getPlace());
        System.out.println(ad.get(userinput).getNumber());

    }
}
