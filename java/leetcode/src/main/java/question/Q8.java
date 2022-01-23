package question;

public class Q8 {
    public int myAtoi(String s) {
        int sign = 1;
        int n = s.length();
        int bound = Integer.MAX_VALUE / 10;

        int result = 0;
        int i = 0;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }

        while (i < n) {
            char c = s.charAt(i++);

            if (!Character.isDigit(c)) {
                break;
            }

            if (result > bound || (result == bound && c - '0' > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }

            result = result * 10 + c - '0';
        }

        return sign * result;
    }
}

/*
8. String to Integer (atoi)
 */