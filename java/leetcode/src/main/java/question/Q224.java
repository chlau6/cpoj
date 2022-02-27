package question;

import java.util.Stack;

public class Q224 {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;
        int n = s.length();
        char[] str = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str[i])) {
                int num = 0;

                while (i < n && Character.isDigit(str[i])) {
                    num = num * 10 + (str[i++] - '0');
                }

                result += sign * num;
                i--;
            } else if (str[i] == '+') {
                sign = 1;
            } else if (str[i] == '-') {
                sign = -1;
            } else if (str[i] == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (str[i] == ')') {
                result = result * stack.pop() + stack.pop();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Q224().calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}

/*
224. Basic Calculator
 */
