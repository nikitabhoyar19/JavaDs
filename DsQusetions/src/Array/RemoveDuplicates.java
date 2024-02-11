package Array;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10, 11, 21, 21 };
        Set<Integer> arrSet = new HashSet<Integer>();

        for(int num : arr) {
            arrSet.add(num);
        }

        System.out.println(arrSet);
    }
}

/*
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        for(int num : arr) {
            if(num != 0) {
                System.out.print(num + " ");
            }
        }
*/
