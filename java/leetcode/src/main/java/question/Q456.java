package question;

import java.util.Stack;

public class Q456 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int last = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < last) return true;

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                last = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
}

/*
456. 132 Pattern
 */
