package day12;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Heterogeneous {
    public static void main(String[] args)
    {
        List<Object> arlist=new ArrayList<>();
        arlist.add("Hello");
        arlist.add(250);
        arlist.add(350);
        arlist.add("Welcome");
        arlist.add("World");

        Iterator<Object> iterator= arlist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
