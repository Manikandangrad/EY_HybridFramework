package day10;

import java.util.Iterator;
import java.util.List;


public class ArrayList {

    public static void main(String[] args)
    {
        List<String>arlist = new java.util.ArrayList<String>();
        arlist.add("India");
        arlist.add("Russia");
        arlist.add("China");
        arlist.add("US");

        //removing the element
        arlist.remove("China");

        //adding the element
        arlist.add("Africa");
        arlist.add(1,"UK");

        //checking whether it is there or not(True or False)
        System.out.println(arlist.contains("India"));
        System.out.println(arlist.contains("Japan"));

       // for(int i=0;i< arlist.size();i++)
       // {
         //   System.out.println(arlist.get(i));
        //}

        Iterator<String> iterator= arlist.iterator();
        while (iterator.hasNext())
        {
            String next= iterator.next();
            System.out.println(next);
        }
    }
}