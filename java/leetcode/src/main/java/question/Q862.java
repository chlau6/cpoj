package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q862 {
    public int shortestSubarray(int[] nums, int k) {
        int result = Integer.MAX_VALUE;
        int n = nums.length;
        long[] sum = new long[n + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() && sum[i] - sum[dq.getFirst()] >= k) {
                result = Math.min(result, i - dq.pollFirst());
            }

            while (!dq.isEmpty() && sum[i] <= sum[dq.getLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

/*
862. Shortest Subarray with Sum at Least K
 */
