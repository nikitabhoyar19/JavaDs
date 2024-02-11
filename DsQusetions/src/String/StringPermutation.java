package String;

import java.util.*;

public class StringPermutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
        //permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        boolean freq[] = new boolean[nums.length];

        recurPermute(nums, ds, ans, freq);

        return ans;
    }

    public static void recurPermute(int nums[], List<Integer> ds, List<List<Integer>> ans, boolean freq[]) {
        //System.out.println(ds);
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            System.out.println();
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            //System.out.println(Arrays.toString(freq));
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

