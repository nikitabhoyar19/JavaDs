package Array;

import java.util.*;

public class DuplicateElementInArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 1, 1};

        List<Integer> arrSet = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            if(!arrSet.contains(arr[i])) {
                arrSet.add(arr[i]);
            }
            else {
                System.out.println(arr[i]);
                arrSet.remove(arr[i]); // so it will not count that element again and again
            }
        }

    }
}
