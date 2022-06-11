package question;

import java.util.Stack;

public class Q907 {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] dp = new int[n + 1];
        int m = 1000000007;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            dp[i + 1] = (dp[stack.peek() + 1] + (i - stack.peek()) * arr[i]) % m;
            stack.push(i);
            result = (result + dp[i + 1]) % m;
        }

        return result;
    }
}

/*
907. Sum of Subarray Minimums
 */
