package question;

public class Q402 {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        int keep = n - k;
        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            while (top >= 0 && stack[top] > c && k > 0) {
                top--;
                k--;
            }

            stack[++top] = c;
        }

        int index = 0;

        while (index < keep && stack[index] == '0') {
            index++;
        }

        return index == keep ? "0" : new String(stack, index, keep - index);
    }
}

/*
402. Remove K Digits
 */
