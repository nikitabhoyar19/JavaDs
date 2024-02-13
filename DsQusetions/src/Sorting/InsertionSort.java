package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = { 12, 11, 13, 5, 6 };
        sort(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int nums[]) {
        int n = nums.length;

//        for(int i = 1; i < n; i++) {
//            int key = nums[i];
//            int j = i - 1;
//
//            while(j >= 0 && nums[j] > key) {
//                nums[j + 1] = nums[j];
//                j = j - 1;
//            }
//
//            nums[j + 1] = key;
//        }

        for(int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;

        }
    }
}

// abhi apn 2 pe hai
// 7924516
// if j = 1, i = 2
// j + 1 = nums[2] = 5
// j = 0
// nums[1] = 2
//

