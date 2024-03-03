package Array;

public class LongestSubArrayOfK {

    public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 1, 1, 0, 1 };
         int k = 3;

        System.out.println(longestSubArray(arr, k));
    }

    private static int longestSubArray(int[] nums, int k) {
        int count = 0;
        int l = 0, r = 0;
        long sum = nums[0];

        while(r < nums.length) {

            // if sum greater
            while(l <= r && sum > k) {
                sum -= nums[l];
                l++;
            }

            if(sum == k) {
                count = Math.max(count, r-l+1);
            }
            r++;

            if(r < nums.length) {
                sum += nums[r];
            }
        }

        return count;
    }

}

/*
int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {

                sum += nums[j];

                if(sum == k) {
                    count = Math.max(count, j-i+1);
                }
            }
        }
        return count;
*/
