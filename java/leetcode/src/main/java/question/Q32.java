package question;

import annotation.DynamicProgramming;
import annotation.Stacks;
import annotation.Strings;

import java.util.Stack;

@Strings
@DynamicProgramming
@Stacks
public class Q32 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int longestValidParentheses(String s) {
        int n = s.length();

        int result = 0;
        char[] m = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            if (m[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }

        return result;
    }
}

/*
32. Longest Valid Parentheses
 */
