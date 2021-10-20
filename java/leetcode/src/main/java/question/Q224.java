package question;

import annotation.Maths;
import annotation.Recursion;
import annotation.Stacks;
import annotation.Strings;

import java.util.Stack;

@Maths
@Strings
@Stacks
@Recursion
public class Q224 {
    public int calculate(String s) {
        int length = s.length();
        int sign = 1;
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < length && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i++) - '0';
                }
                result += sign * num;
                i--;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
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
