package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q995 {
    public int minKBitFlips(int[] nums, int k) {
        int result = 0;
        int n = nums.length;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!q.isEmpty() && i >= (q.peek() + k)) {
                q.poll();
            }

            if (q.size() % 2 == nums[i]) {
                if (i + k > n) return -1;
                q.add(i);
                result++;
            }
        }

        return result;
    }
}

/*
995. Minimum Number of K Consecutive Bit Flips
 */
