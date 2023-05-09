package day11;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args)
    {
        List<String> arlist = new java.util.LinkedList<String>();
        arlist.add("Hello");
        arlist.add("All");
        arlist.add("Welcome");
        arlist.add("To");
        arlist.add("Java Learning");
        arlist.remove("All");
        arlist.add(1,"Guys");
        arlist.add("Hello");
        Iterator<String> iterator=arlist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
