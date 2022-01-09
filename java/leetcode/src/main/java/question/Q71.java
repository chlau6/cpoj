package question;

import java.util.Stack;

public class Q71 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : stack) {
            result.append('/').append(s);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}

/*
71. Simplify Path
 */
