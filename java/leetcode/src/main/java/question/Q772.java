package question;

public class Q772 {
    public static void main(String[] args) {
        System.out.println(new Q772().calculate("2*(5+5*2)/3+(6/2+8)"));
    }

    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int calculate(String s) {
        int len = s.length();
        int num = 0;
        int currentResult = 0;
        int result = 0;
        char operand = '+';

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                int j = i;
                int count = 0;
                while (i < len) {
                    if (s.charAt(i) == '(') count++;
                    if (s.charAt(i) == ')') count--;
                    if (count == 0) break;
                    i++;
                }
                num = calculate(s.substring(j + 1, i + 1));
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || i == len - 1) {
                if (operand == '+') currentResult += num;
                else if (operand == '-') currentResult -= num;
                else if (operand == '*') currentResult *= num;
                else if (operand == '/') currentResult /= num;

                if (c == '+' || c == '-' || i == len - 1) {
                    result += currentResult;
                    currentResult = 0;
                }

                operand = c;
                num = 0;
            }
        }
        return result;
    }
}

/*
772. Basic Calculator III
 */

