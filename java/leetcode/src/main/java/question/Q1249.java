package question;

import java.util.Stack;

public class Q1249 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i + 1);
            } else if (c == ')') {
                if (!stack.empty() && stack.peek() > 0) {
                    stack.pop();
                } else {
                    stack.push(-(i + 1));
                }
            }
        }

        while (!stack.empty()) {
            builder.deleteCharAt(Math.abs(stack.pop()) - 1);
        }

        return builder.toString();
    }
}

/*
1249. Minimum Remove to Make Valid Parentheses
 */
