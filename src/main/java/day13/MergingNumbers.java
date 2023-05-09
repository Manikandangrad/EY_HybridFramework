package day13;

import com.google.common.collect.Streams;

import java.util.Arrays;

public class MergingNumbers {
    public static void main(String[] args) {
        int a[]={5,2,1,4,3};
        int b[]={8,6,7,9,10};
        Streams.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().forEach(x->System.out.println(x));
    }
}
