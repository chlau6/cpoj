package question;

import java.util.Stack;

public class Q1081 {
    public String smallestSubsequence(String s) {
        Stack<Character> stack = new Stack<>();
        int[] counts = new int[256];
        char[] str = s.toCharArray();
        boolean[] visited = new boolean[256];

        for (char c : str) {
            counts[c]++;
        }

        for (char c : str) {
            counts[c]--;

            if (visited[c]) continue;

            while (!stack.isEmpty() && c < stack.peek() && counts[stack.peek()] > 0) {
                visited[stack.pop()] = false;
            }

            stack.push(c);
            visited[c] = true;
        }

        StringBuilder builder = new StringBuilder();

        for (char c : stack) {
            builder.append(c);
        }

        return builder.toString();
    }
}

/*
1081. Smallest Subsequence of Distinct Characters
 */
