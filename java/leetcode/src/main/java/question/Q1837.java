package question;

public class Q1837 {
    public int sumBase(int n, int k) {
        int result = 0;

        while (n > 0) {
            result += n % k;
            n /= k;
        }

        return result;
    }
}

/*
1837. Sum of Digits in Base K
 */
