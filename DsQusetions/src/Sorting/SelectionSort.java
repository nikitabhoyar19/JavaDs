package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int nums[] = { 12, 11, 13, 5, 6 };
        sort(nums);

        for(int num : nums) {
            System.out.println(num);
        }

    }

    public static void sort(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min])
                    min = j;
            }
                   int temp = nums[min];
                   nums[min] = nums[i];
                   nums[i] = temp;
        }
    }
}

/*
12 11 13 5 6

12 < 11 min  11 < 13 min 11  5 < 11 min 5  6 < 5 min 5
swap it
*/
