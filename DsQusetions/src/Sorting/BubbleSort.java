package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int nums[] = { 12, 11, 13, 5, 6 };
        sort(nums);

        for(int num : nums) {
            System.out.println(num);
        }

    }

    public static void sort(int nums[]) {

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[j] < nums[i]) {

                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }
        }
    }
}
