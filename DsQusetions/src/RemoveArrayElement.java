public class RemoveArrayElement {

    public static void main(String[] args) {

        int arr[] = {2, 3, 6, 8, 9, 0, 6};
        int resultArray[] = removeElement(arr, 3);

        for(int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeElement(int[] nums, int val) {

        int index = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return nums;
    }

}
