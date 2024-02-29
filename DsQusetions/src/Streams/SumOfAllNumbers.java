package Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(4,5,6,7,1,2,3);

        int sum = intlist.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
