package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesWhichHasTargetSum {

    public static void main(String[] args) {
        int[] nums = {2, 1, 1};
        int target = 2;
        generateSubs(0, new ArrayList<>(), 0, target, nums);
    }

    private static void generateSubs(int index, List<Integer> ds, int currentSum, int target, int[] nums) {
        if (index == nums.length) {
            if (target == currentSum) {
                System.out.println(ds);
            }
            return;
        }

        // include
        ds.add(nums[index]);
        currentSum += nums[index];
        generateSubs(index + 1, ds, currentSum, target, nums);

        ds.remove(ds.size() - 1);
        currentSum -= nums[index]; // Undo the addition from the include step

        // exclude
        generateSubs(index + 1, ds, currentSum, target, nums);
    }
}
