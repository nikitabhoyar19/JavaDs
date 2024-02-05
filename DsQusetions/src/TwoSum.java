import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 10, 19, 4, 9, 11, 21, 55};
        int target = 15;
        int result[] = twoSum(nums, target);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        // creating hashmap to store location of target-num
        HashMap<Integer, Integer> map = new HashMap<>();

        // checking if that element is already present in map
        // if not then add it to map and its index also
        for(int i=0; i<length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target-nums[i], i);
        }

        return new int[]{-1,-1};
    }

}
