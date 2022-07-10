package question;

public class Q2156 {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        int n = s.length();
        long sum = 0;
        long multiple = 1;
        int result = 0;

        for (int i = n - 1; i >= 0; i--) {
            int curr = s.charAt(i) - 'a' + 1;

            sum = (sum * power + curr) % modulo;

            if (i + k >= n) {
                multiple = multiple * power % modulo;
            } else {
                int last = s.charAt(i + k) - 'a' + 1;
                sum = (sum - last * multiple % modulo + modulo) % modulo;
            }

            if (sum == hashValue) {
                result = i;
            }
        }

        return s.substring(result, result + k);
    }
}

/*
2156. Find Substring With Given Hash Value
 */
