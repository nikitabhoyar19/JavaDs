package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumNumber {

    public static void main(String[] args) {

        List<Integer> numArray = Arrays.asList(1, 2, 4, 5, 9, 10, 15, 20, 108);

        Integer max = numArray.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);
    }
}
