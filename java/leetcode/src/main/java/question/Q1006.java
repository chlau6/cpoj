package question;

import java.util.Stack;

public class Q1006 {
    public int clumsy(int n) {
        char[] ops = new char[]{'*', '/', '+', '-'};
        int result = n;
        int k = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 1; i--) {
            char op = ops[k];

            if (op == '*') {
                result *= i;
            } else if (op == '/') {
                result /= i;
            } else if (op == '+') {
                result += i;
            } else {
                stack.push(result);

                result = -i;
            }

            k = (k + 1) % 4;
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}

/*
1006. Clumsy Factorial
 */
