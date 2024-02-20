package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElement {

    public static void main(String[] args) {

        int nums[] = { 4, 5, 8, 9, 10, 1, 5, 21 };

        System.out.println(findKthSmallest(nums, 2));

    }

    private static int findKthSmallest(int[] nums, int k) {

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : nums) {
            maxHeap.offer(i);
            while(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
    }
}
