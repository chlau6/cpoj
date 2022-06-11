package question;

public class Q1888 {
    public int minFlips(String s) {
        int n = s.length();

        char[] str = (s + s).toCharArray();
        char[] s1 = new char[2 * n];
        char[] s2 = new char[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            s1[i] = i % 2 == 0 ? '0' : '1';
            s2[i] = i % 2 == 0 ? '1' : '0';
        }

        int result = Integer.MAX_VALUE;
        int r1 = 0;
        int r2 = 0;
        int i = 0;

        for (int j = 0; j < 2 * n; j++) {
            if (str[j] != s1[j]) {
                r1++;
            }

            if (str[j] != s2[j]) {
                r2++;
            }

            if (j >= n) {
                if (str[i] != s1[i]) {
                    r1--;
                }

                if (str[i] != s2[i]) {
                    r2--;
                }

                i++;
            }

            if (j >= n - 1) {
                result = Math.min(result, Math.min(r1, r2));
            }
        }

        return result;
    }
}

/*
1888. Minimum Number of Flips to Make the Binary String Alternating
 */
