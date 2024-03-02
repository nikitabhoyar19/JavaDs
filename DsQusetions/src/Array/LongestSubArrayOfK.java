package Array;

public class LongestSubArrayOfK {

    public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
         int k = 3;

        System.out.println(longestSubArray(arr, k));
    }

    private static int longestSubArray(int[] arr, int k) {
        int globalCount = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < k) {
                sum+= arr[i];
            }
            if(sum == k) {
               globalCount+=1;
            }
        }
        return globalCount;
    }


}
