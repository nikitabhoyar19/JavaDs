package Array;

import java.util.*;

public class AllPairsMatchesTargetSum {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 21};

        printPairs(arr, 10);

    }

    public static void printPairs(int arr[], int target) {

        Set<Integer> arrSet = new HashSet<Integer>();

        for(int num : arr) {
            int value = target - num;
            if(!arrSet.contains(value)) {
                arrSet.add(num);
            }
            else {
                System.out.println("Pair : " + value + "," + num);
            }
        }
    }
}
