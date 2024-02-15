package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortPractice {

    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 10, 9 };
        sort(arr, 0, arr.length-1);

        for(int num : arr) {
            System.out.println(num);
        }

    }

    private static void sort(int[] arr, int low, int high) {

        if (low == high)  return;
            int mid = (low + high) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            mergeThis(arr, low, mid, high);

    }

    private static void mergeThis(int[] nums, int low, int mid, int high) {

        //List<Integer> numsList = new ArrayList<>();
        int[] temp = new int[nums.length];

        int left = low;
        int right = mid + 1;
        int k = low;

        while(left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

            while(left <= mid) {
                temp[k++] = nums[left++];
            }

            while(right <= high) {
                temp[k++] = nums[right++];
            }

            // copy all elements from temp array to nums array
            for (int i = low; i <= high; i++) {
                nums[i] = temp[i];
            }

    }
}
