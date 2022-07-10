package question;

public class Q1759 {
    public int countHomogenous(String s) {
        int i = 0;
        int n = s.length();
        long result = 0;
        int mod = 1000000007;

        for (int j = 0; j < n; j++) {
            if (s.charAt(i) != s.charAt(j)) {
                result += arithmeticSum(j - i);
                result %= mod;
                i = j;
            }
        }

        result += arithmeticSum(n - i);
        result %= mod;

        return (int) result;
    }

    public long arithmeticSum(long n) {
        return (1 + n) * n / 2;
    }
}

/*
1759. Count Number of Homogenous Substrings
 */
