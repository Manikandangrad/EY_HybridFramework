package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {
    public static void main(String[] args) {
//        Sorting Numbers
        List<Integer> arlist =Arrays.asList(45,23,16,74);
        arlist.stream().sorted().forEach(x->System.out.println(x));

//        Sorting Strings
        List<String> arlists=Arrays.asList("Caron","Abi","Danush","Benny");
        List<String> name= arlists.stream().sorted().collect(Collectors.toList());
        System.out.println(name);

//        Sorting Using Array
        String a[]={"hussain","megalai","mani"};
        Arrays.stream(a).sorted().forEach(x->System.out.println(x));
    }
}
