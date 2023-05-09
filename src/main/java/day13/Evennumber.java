package day13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumber {
    public static void main(String[] args)
    {
//        Print the Even Numbers Using Traditional Arraylist
        List<Integer> arlist = new ArrayList<Integer>();
        arlist.add(1);
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        arlist.add(5);
        arlist.add(6);
        Iterator<Integer> iterator=arlist.iterator();
        while (iterator.hasNext())
        {
            int num=iterator.next();
            if(num%2==0)
            {
                System.out.println(num);
            }
        }

        System.out.println("Stream Output");

//        Print the Even Numbers Using Streams
        List<Integer> arlists= Arrays.asList(11,12,13,14,15,16);
        List<Integer> collect= arlists.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(collect);

//        Other way of printing output in Streams
         arlists.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
    }
}
