package Streams;

import java.util.Arrays;
import java.util.List;

public class CountStringLength {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Hello","Interview","Que","Ans","Ram","for");

        // count strings that length greater than 3
        long count = stringList.stream().filter(s -> s.length() > 3).count();
        long countAllStrings = stringList.stream().count();
        System.out.println(count);
        System.out.println(countAllStrings);

        //printAllStrings
        stringList.stream().filter(s -> s.length() < 4).forEach(System.out::println);

    }
}
