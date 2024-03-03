package matrix;

public class RotateBy90 {

    public static void main(String[] args) {
        int nums[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotateBy90(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }
    }

    private static void rotateBy90(int[][] nums) {

        int n = nums.length;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int temp = 0;
                temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < nums.length / 2; j++) {
                int temp = 0;
                temp = nums[i][j];
                nums[i][j] = nums[i][nums.length-1-j];
                nums[i][nums.length-1-j] = temp;
            }
        }
    }
}

/*
t.c = o(n2)
s.c = o(n2)
int rowToCol[][] = new int[nums.length][nums[0].length];

        for(int i = 0; i < nums.length; i++) {

            for(int j = 0; j < nums[0].length; j++) {
                rowToCol[j][nums.length - i - 1] = nums[i][j];
            }
        }

        return rowToCol;
*/
