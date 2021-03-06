package question;

public class Q1758 {
    public int minOperations(String s) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) - '0' == i % 2) {
                result++;
            }
        }

        return Math.min(result, n - result);
    }
}

/*
1758. Minimum Changes To Make Alternating Binary String
 */
