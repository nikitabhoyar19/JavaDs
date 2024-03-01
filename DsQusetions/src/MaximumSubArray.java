public class MaximumSubArray {

    public static void main(String[] args) {
        int nums[] = { 4, 6, -3, 4, 5 };
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int globalsum = nums[0];
        int currentsum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];

            if (globalsum <= currentsum) {
                globalsum = currentsum;
            }

            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return globalsum;
    }
}
