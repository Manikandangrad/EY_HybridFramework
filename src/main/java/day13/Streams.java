package day13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class Streams {
    public static void main(String[] args) {
//     ArrayList Using Traditional Method
        List<Integer> arlist = new ArrayList<Integer>();
        arlist.add(1);
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        arlist.add(5);

//        Printing the values in Traditional Method
        Iterator<Integer> iterator= arlist.iterator();
        while(iterator.hasNext())
        {
           int num= iterator.next();
            System.out.println(num);
        }

        System.out.println("Stream Output");

//             ArrayList Using Streams
        List<Integer> arlists= Arrays.asList(6,7,8,9,10);

//        Printing the values in Streams
        List<Integer> collect= arlists.stream().map(x->x).collect(Collectors.toList());
        System.out.println(collect);

//        Other way of printing output in Streams
        arlists.stream().map(x->x).forEach(x->System.out.println(x));
        }
    }
