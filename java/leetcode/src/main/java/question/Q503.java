package question;

import java.util.Arrays;
import java.util.Stack;

public class Q503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }

            stack.push(i % n);
        }

        return result;
    }
}

/*
503. Next Greater Element II
 */