
package question;

public class Q233 {
    public int countDigitOne(int n) {
        int result = 0;

        for (long m = 1; m <= n; m *= 10) {
            long a = n / m;
            long b = n % m;

            result += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }

        return result;
    }
}

/*
233. Number of Digit One
 */
