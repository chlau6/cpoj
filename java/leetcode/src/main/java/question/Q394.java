package question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q394 {
    /*
    Queue Recursion
     */
    public String decodeString(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }

        return helper(queue);
    }

    private String helper(Queue<Character> queue) {
        StringBuilder builder = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()) {
            char c = queue.remove();

            if (c == '[') {
                String inner = helper(queue);
                for (int i = 0; i < num; i++) {
                    builder.append(inner);
                }
                num = 0;
            } else if (c == ']') {
                break;
            } else if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    /*
    Stack Iterative
     */
    public String decodeString2(String s) {
        int currNum = 0;
        StringBuilder currString = new StringBuilder();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[') {
                stack.push(currString.toString());
                stack.push(Integer.toString(currNum));
                currNum = 0;
                currString = new StringBuilder();
            } else if (c == ']') {
                int lastNum = Integer.parseInt(stack.pop());
                String lastString = stack.pop();

                currString = new StringBuilder(lastString + currString.toString().repeat(lastNum));
            } else if (Character.isDigit(c)) {
                currNum = currNum * 10 + c - '0';
            } else {
                currString.append(c);
            }
        }
        return currString.toString();
    }
}

/*
394. Decode String
 */
