package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

    public static void main(String[] args) {

        int nums[] = { 4, 5, 8, 9, 10, 1, 5, 21 };

        System.out.println(findKthLargest(nums, 2));
    }

    public static int findKthLargest(int[] nums, int k) {

        Queue<Integer> maxHeap = new PriorityQueue<>(k);

        for(int i : nums) {
            maxHeap.offer(i);
            while(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.poll();

    }

}
