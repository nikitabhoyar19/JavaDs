package Array;

public class FindModGreater {

    public static void main(String[] args) {
        int arr[] = { 1, 15, 20, 5};
        int l = 4;
        findGreaterModOfIandJ(arr, l);
    }

    public static void findGreaterModOfIandJ(int[] arr, int n) {
        int value;
        int ans = -1;
        int value_x = -1;
        int value_y = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[j] != 0 && j != 0) {
                        value = Math.floorMod(arr[i], arr[j]) + Math.floorMod(i, j);
                        if (value > ans) {
                            ans = value;
                            value_x = i;
                            value_y = j;
                        }
                    }
                }
            }
        }
        System.out.println("Max Value: " + ans);
        System.out.println("Index x: " + value_x);
        System.out.println("Index y: " + value_y);
    }
}
