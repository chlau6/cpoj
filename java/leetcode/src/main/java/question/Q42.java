package question;

import java.util.Stack;

public class Q42 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        int i = 0;

        while (i < height.length) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i++);
            } else {
                int middleHeight = height[stack.pop()];

                if (stack.isEmpty()) continue;

                int leftHeight = height[stack.peek()];
                int rightHeight = height[i];

                water += (Math.min(leftHeight, rightHeight) - middleHeight) * (i - stack.peek() - 1);
            }
        }
        return water;
    }
}

/*
42. Trapping Rain Water
 */
