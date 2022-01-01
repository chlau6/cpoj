package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q239 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        int index = 0;

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);

            if (i >= k - 1) {
                ans[index++] = nums[q.peek()];
            }
        }
        return ans;
    }
}

/*
238. Product of Array Except Self
 */