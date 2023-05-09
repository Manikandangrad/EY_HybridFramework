package day13;

import java.util.Arrays;
import java.util.List;

public class SquaringNumbers {
    public static void main(String[] args)
    {
        List<Integer> arlist= Arrays.asList(1,3,5);
        arlist.stream().map(x->x*x).forEach(x->System.out.println(x));
    }
}
