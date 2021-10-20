package question;

import annotation.Stacks;
import annotation.Strings;

import java.util.Stack;

@Strings
@Stacks
public class Q20 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

/*
20. Valid Parentheses
 */
