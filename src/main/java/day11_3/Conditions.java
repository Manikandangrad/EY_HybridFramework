package day11_3;

public class Conditions {
    public static void main(String[] args) {
        //if else condition
        boolean flag = true;
        if (flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }

        System.out.println("******");

        String x="Manikandan";
        if(x.equals("Manikandan"))
        {
            System.out.println("Valid name");
        }
        else
        {
            System.out.println("Invalid name");
        }

        System.out.println("******");

        String y="MANIKANDAN";
        if(y.toLowerCase().equals("manikandan"))
        {
            System.out.println("Valid name");
        }
        else
        {
            System.out.println("Invalid name");
        }

        System.out.println("******");

        String z="Madhu";
        if(z.contains("Madhu"))
        {
            System.out.println("Madhu is there");
        }
        else
        {
            System.out.println("Madhu is not there");
        }

        System.out.println("******");

        String a="Location:Kulasekharam";
        if (a.contains("Location"))
        {
            String place=a.replace("Kulasekharam","Marthandam");
            System.out.println(place);
        }
        else {
            System.out.println("Invalid Location");
        }

        System.out.println("******");

        String b= "City:Madurai";
        if(b.contains("City"))
        {
            String[] str=b.split(":");
            System.out.println("City:"+str[1]);
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
