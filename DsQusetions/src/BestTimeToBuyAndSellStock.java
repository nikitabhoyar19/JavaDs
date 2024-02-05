import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2, 5, 6, 7, 10, 1, 19, 5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int[] rightArray = prices.clone();
        int profit = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (rightArray[i + 1] > rightArray[i]) {
                rightArray[i] = rightArray[i + 1];
            }
        }

        System.out.print("RightArray : ");
        System.out.println(Arrays.toString(rightArray));

        for (int i = 0; i < n; i++) {
            profit = Math.max(rightArray[i] - prices[i], profit);

        }
        System.out.print("Profit : ");
        return profit;
    }
}


