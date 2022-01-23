package question;

import java.util.Arrays;
import java.util.Stack;

public class Q84 {
    /*
    Monotonic Stack
     */
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] h = Arrays.copyOf(heights, n + 1);

        int i = 0;
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        while (i <= n) {
            if (stack.isEmpty() || h[stack.peek()] < h[i]) {
                stack.push(i++);
            } else {
                int prev = stack.pop();
                result = Math.max(result, h[prev] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }

        return result;
    }
}

/*
84. Largest Rectangle in Histogram
 */
