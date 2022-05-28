package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q1438 {
    public int longestSubarray(int[] nums, int limit) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        Deque<Integer> minD = new LinkedList<>();
        Deque<Integer> maxD = new LinkedList<>();

        while (i < n && j < n) {
            while (!maxD.isEmpty() && nums[j] > maxD.peekLast()) {
                maxD.removeLast();
            }

            while (!minD.isEmpty() && nums[j] < minD.peekLast()) {
                minD.removeLast();
            }

            maxD.addLast(nums[j]);
            minD.addLast(nums[j]);

            if (maxD.peekFirst() - minD.peekFirst() > limit) {
                if (maxD.peek() == nums[i]) {
                    maxD.removeFirst();
                }

                if (minD.peek() == nums[i]) {
                    minD.removeFirst();
                }

                i++;
            }

            j++;
        }

        return j - i;
    }
}

/*
1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 */
