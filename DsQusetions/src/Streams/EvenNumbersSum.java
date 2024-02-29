package Streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersSum {

    public static void main(String[] args) {

        List<Integer> numArray = Arrays.asList(1, 2, 4, 5, 9, 10, 15, 20, 108);

        int sumOfEvenNumbers = numArray.stream().filter(num -> num%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEvenNumbers);
    }
}
