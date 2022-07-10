package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q1696 {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(0);
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (dq.getFirst() + k < i) {
                dq.removeFirst();
            }

            nums[i] += nums[dq.getFirst()];

            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        return nums[n - 1];
    }
}

/*
1696. Jump Game VI
 */
