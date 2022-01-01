package question;

public class Q29 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int result = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >>> i) - b >= 0) {
                result += (1 << i);
                a -= (b << i);
            }
        }

        return (dividend > 0 == divisor > 0) ? result : -result;
    }
}

/*
29. Divide Two Integers
 */
