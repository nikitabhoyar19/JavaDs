package recursion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        List<List<Integer>> subsequences = findSubsequences(nums);
        System.out.println("All subsequences:");
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    private static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsequences(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsequences(int[] nums, int index, ArrayList<Integer> current, List<List<Integer>> result) {

        if(index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        //include
        current.add(nums[index]);
        generateSubsequences(nums, index+ 1, current, result);

        //exclude
        current.remove(current.size()-1);
        generateSubsequences(nums, index+1, current, result);
    }
}
