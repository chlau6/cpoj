package question;

public class Q1317 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (isNoZero(i) && isNoZero(n - i)) {
                return new int[] {i, n - i};
            }
        }

        return new int[] {-1, -1};
    }

    public boolean isNoZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }

        return true;
    }
}

/*
1317. Convert Integer to the Sum of Two No-Zero Integers
 */
