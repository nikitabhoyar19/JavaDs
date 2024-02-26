package Array;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 2, 2, 3, 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int cal = nums.length / 2;

        for(int num : nums) {
            hmap.put(num, hmap.getOrDefault(num,0)+1);
            if(hmap.get(num) > cal) return num;
        }

        return -1;
    }
}
