package question;

public class Q357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int result = 10;
        int candidate = 9;

        for (int i = 2; i <= n; i++) {
            candidate *= (11 - i);
            result += candidate;
        }

        return result;
    }
}

/*
357. Count Numbers with Unique Digits
 */
