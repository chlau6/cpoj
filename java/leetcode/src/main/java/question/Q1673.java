package question;

import java.util.Stack;

public class Q1673 {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[k];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()] && n - i + stack.size() > k) {
                stack.pop();
            }

            if (stack.size() < k) {
                stack.push(i);
            }
        }

        while (--k >= 0) {
            result[k] = nums[stack.pop()];
        }

        return result;
    }
}

/*
1673. Find the Most Competitive Subsequence
 */
