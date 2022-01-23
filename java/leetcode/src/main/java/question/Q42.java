package question;

import java.util.Stack;

public class Q42 {
    /*
    Two Pointer
     */
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;

        while (i <= j) {
            int minHeight = Math.min(height[i], height[j]);

            if (minHeight == height[i]) {
                i++;
                while (i < j && height[i] < minHeight) {
                    result += minHeight - height[i++];
                }
            } else {
                j--;
                while (i < j && height[j] < minHeight) {
                    result += minHeight - height[j--];
                }
            }
        }

        return result;
    }

    /*
    Monotonic Stack
     */
    public int trap2(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        while (i <= j) {
            if (stack.isEmpty() || height[stack.peek()] > height[i]) {
                stack.push(i++);
            } else {
                int prev = stack.pop();

                if (stack.isEmpty()) continue;

                result += (Math.min(height[i], height[stack.peek()]) - height[prev]) * (i - stack.peek() - 1);
            }
        }

        return result;
    }
}

/*
42. Trapping Rain Water
 */
