package question;

import java.util.Stack;

public class Q85 {
    /*
    Monotonic Stack
     */
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        int[] height = new int[n + 1];

        for (int i = 0; i < m; i++) {
            Stack<Integer> stack = new Stack<>();

            for (int j = 0; j < n + 1; j++) {
                if (j < n) {
                    height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
                }

                while (!stack.isEmpty() && height[stack.peek()] >= height[j]) {
                    int prev = stack.pop();

                    result = Math.max(result, height[prev] * (stack.isEmpty() ? j : j - stack.peek() - 1));
                }

                stack.push(j);
            }
        }

        return result;
    }
}

/*
85. Maximal Rectangle
 */
