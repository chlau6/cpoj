package question;

public class Q306 {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) break;

            long x = Long.parseLong(num.substring(0, i));

            for (int j = i + 1; j < n; j++) {
                if (num.charAt(i) == '0' && j > i + 1) break;

                long y = Long.parseLong(num.substring(i, j));

                if (isValid(x, y, num.substring(j))) return true;
            }
        }

        return false;
    }

    public boolean isValid(long x, long y, String num) {
        if (num.isEmpty()) return true;

        long b = x + y;
        long a = y;

        String sum = Long.toString(b);
        int n = sum.length();

        return num.startsWith(sum) && isValid(a, b, num.substring(n));
    }
}

/*
306. Additive Number
 */
