package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCubeOfElementsGreaterThan50 {

    public static void main(String[] args) {

        List<Integer> cubelist = Arrays.asList(4,5,6,7,1,2,3);

        cubelist.stream().map(ele -> ele*ele*ele).filter(ele -> ele > 50).forEach(System.out :: println);

    }
}
