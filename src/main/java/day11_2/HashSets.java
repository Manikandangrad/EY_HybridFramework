package day11_2;

import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String[] args)
    {
        Set<String> arset = new java.util.HashSet<String>();
        arset.add("Hello");
        arset.add("All");
        arset.add("Welcome");
        arset.add("To");
        arset.add("Java Learning");
        arset.add("Hello");

        Iterator<String> iterator=arset.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

}
