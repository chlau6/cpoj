package question;

import java.util.Stack;

public class Q856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(result);
                result = 0;
            } else {
                result = stack.pop() + Math.max(result * 2, 1);
            }
        }

        return result;
    }
}

/*
856. Score of Parentheses
 */
