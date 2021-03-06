package question;

public class Q227 {
    public int calculate(String s) {
        int result = 0;
        int tempResult = 0;
        int num = 0;
        int n = s.length();
        char lastOp = '+';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || i == n - 1) {
                if (lastOp == '+') {
                    tempResult += num;
                } else if (lastOp == '-') {
                    tempResult -= num;
                } else if (lastOp == '*') {
                    tempResult *= num;
                } else if (lastOp == '/') {
                    tempResult /= num;
                }

                if (c == '+' || c == '-' || i == n - 1) {
                    result += tempResult;
                    tempResult = 0;
                }

                lastOp = c;
                num = 0;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Q227().calculate("3+2*2"));
    }
}

/*
227. Basic Calculator II
 */
