import java.util.*;
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = { -1,1,0,-3,3 };
        int result[] = productExceptSelf(arr);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int leftArray[] = new int[l];
        int rightArray[] = new int[l];
        int resultArr[] = new int[l];

        leftArray[0] = 1;
        for (int i = 1; i < l; i++) {
            leftArray[i] = leftArray[i - 1] * nums[i - 1];
        }

        for(int i : leftArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        rightArray[l - 1] = 1;
        for (int i = l - 2; i > -1; i--) {
            rightArray[i] = rightArray[i + 1] * nums[i + 1];
        }

        for(int i : rightArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < l; i++) {
            resultArr[i] = leftArray[i] * rightArray[i];
        }

        return resultArr;
    }

}
