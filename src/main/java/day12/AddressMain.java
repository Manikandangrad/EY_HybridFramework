package day12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AddressMain extends Addressbook{
    public static void main(String[] args)
    {
        AddressMain main1 = new AddressMain();
       main1.setName("Manikandan");
       main1.setPlace("Kavalsthalam");
       main1.setDistrict("Kanniyakumari");
       main1.setState("Tamilnadu");
       main1.setNumber(1234567890);

        AddressMain main2 = new AddressMain();
        main2.setName("Madhan");
        main2.setPlace("Kaliyakkavilai");
        main2.setDistrict("Kanniyakumari");
        main2.setState("Tamilnadu");
        main2.setNumber(1987654320);

        AddressMain main3 = new AddressMain();
        main3.setName("Manoj");
        main3.setPlace("Konam");
        main3.setDistrict("Kanniyakumari");
        main3.setState("Tamilnadu");
        main3.setNumber(1876923450);

//        Listing the Details using Map
        Map<String,Addressbook> ad = new TreeMap<>();
        ad.put("Manikandan",main1);
        ad.put("Madhan",main2);
        ad.put("Manoj",main3);

//        Get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name whom you are looking for:");
        String userinput=scanner.next();

//        Display the input given by the user
        System.out.println(ad.get(userinput).getPlace());
        System.out.println(ad.get(userinput).getNumber());

    }
}
