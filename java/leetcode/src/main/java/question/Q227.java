package question;

import annotation.Maths;
import annotation.Stacks;
import annotation.Strings;
import company.Facebook;

@Maths
@Strings
@Stacks
@Facebook
public class Q227 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int calculate(String s) {
        int tempSum = 0;
        int sum = 0;
        int num = 0;
        int len = s.length();
        char lastOperand = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || i == len - 1) {
                if (lastOperand == '+') {
                    tempSum += num;
                } else if (lastOperand == '-') {
                    tempSum -= num;
                } else if (lastOperand == '*') {
                    tempSum *= num;
                } else {
                    tempSum /= num;
                }

                if (c == '+' || c == '-' || i == len - 1) {
                    sum += tempSum;
                    tempSum = 0;
                }

                lastOperand = c;
                num = 0;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(new Q227().calculate("3+2*2"));
    }
}

/*
227. Basic Calculator II
 */
