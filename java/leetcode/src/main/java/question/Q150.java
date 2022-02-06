package question;

import java.util.Stack;

public class Q150 {
    public int evalRPN(String[] tokens) {
        int result = 0;
        String op = "+-*/";
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!op.contains(token)) {
                stack.push(Integer.parseInt(token));
                continue;
            }

            Integer b = stack.pop();
            Integer a = stack.pop();

            if (token.equals("+")) {
                stack.push(a + b);
            } else if (token.equals("-")) {
                stack.push(a - b);
            } else if (token.equals("*")) {
                stack.push(a * b);
            } else {
                stack.push(a / b);
            }
        }

        return stack.pop();
    }
}

/*
150. Evaluate Reverse Polish Notation
 */
