package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList( 1,2,3,4,1,2,3, 5 );

        integerList.stream().collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Another way : ");
        integerList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);;


    }
}
