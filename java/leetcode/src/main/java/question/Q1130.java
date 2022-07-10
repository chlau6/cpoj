package question;

import java.util.Stack;

public class Q1130 {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int result = 0;

        for (int a : arr) {
            while (stack.peek() <= a) {
                int mid = stack.pop();
                result += mid * Math.min(stack.peek(), a);
            }

            stack.push(a);
        }

        while (stack.size() > 2) {
            result += stack.pop() * stack.peek();
        }

        return result;
    }
}

/*
1130. Minimum Cost Tree From Leaf Values
 */
