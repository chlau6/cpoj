package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int size = n - k + 1;
        int j = 0;
        int[] result = new int[size];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                result[j++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}

/*
239. Sliding Window Maximum
 */