package day11;

import java.util.Iterator;
import java.util.List;

public class ArrayList{
    public static void main(String[] args)
    {
        List<String> arlist = new java.util.ArrayList<String>();
        arlist.add("Hello");
        arlist.add("All");
        arlist.add("Welcome");
        arlist.add("To");
        arlist.add("Intellij Idea");
        arlist.add("Hello");

        //Iterator
        Iterator<String> iterator=arlist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("********");

        //for loop
        for(int i=0;i< arlist.size();i++)
        {
            System.out.println(arlist.get(i));
        }

        System.out.println("********");

        //for each loop
        for(String ar:arlist)
        {
            System.out.println(ar);
        }

    }
}
