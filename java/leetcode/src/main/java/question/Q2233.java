package question;

import java.util.PriorityQueue;

public class Q2233 {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int m = 1000000007;

        for (int num : nums) {
            pq.add(num);
        }

        while (--k >= 0) {
            int top = pq.poll();
            pq.add(++top);
        }

        long result = 1;

        while (!pq.isEmpty()) {
            result = result * pq.poll() % m;
        }

        return (int) result;
    }
}

/*
2233. Maximum Product After K Increments
 */
