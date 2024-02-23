package Array;

import java.util.*;
public class Sort0s1s2s {

    public static void main(String[] args) {

        int nums[] = {2, 1, 0, 2, 1, 1, 0, 0};

        sortColors(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length-1;
        while(m <= h) {
            switch(nums[m]) {
                case 0:
                    swap(nums, l, m);
                    l++;
                    m++;
                    break;

                case 1:
                    m++;
                    break;

                case 2:
                    swap(nums, h, m);
                    h--;
                    break;
            }
        }

}



/*
_____   ________ _______   _______
l   m-1 m       m                h

000000  1111111  12012     222222
sorted  sorted   unsorted  sorted
                 this
                 is
                 our
                 part
                 imagin
 */
}
