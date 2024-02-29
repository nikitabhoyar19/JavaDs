package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayElements {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4,5,1,2,3);

        integerList.stream().sorted().forEach(System.out::println);

    }
}
