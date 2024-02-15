package recursion;

import java.util.ArrayList;
import java.util.List;

public class OnyOneSubsequenceWhhichHasSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int target = 2;
        generateOneSubs(0, new ArrayList<>(), 0, target, nums);
    }

    private static boolean generateOneSubs(int index, List<Integer> ds, int currentSum, int target, int[] nums) {
        if (index == nums.length) {
            if (target == currentSum) {
                System.out.println(ds);
                return true;
            }
            return false;
        }

        // include
        ds.add(nums[index]);
        currentSum += nums[index];

        // if we changing here as we want one subsequence only
        if(generateOneSubs(index + 1, ds, currentSum, target, nums) == true) return true;

        ds.remove(ds.size() - 1);
        currentSum -= nums[index]; // Undo the addition from the include step

        // exclude
        // if we changing here as we want one subsequence only
        if(generateOneSubs(index + 1, ds, currentSum, target, nums) == true) return true;

        return false;
    }
}
