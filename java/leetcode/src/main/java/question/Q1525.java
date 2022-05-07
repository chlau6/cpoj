package question;

public class Q1525 {
    public int numSplits(String s) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int n = s.length();
        int result = 0;
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            d2 += (++c2[c - 'a'] == 1) ? 1 : 0;
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            d2 -= (--c2[c - 'a'] == 0) ? 1 : 0;
            d1 += (++c1[c - 'a'] == 1) ? 1 : 0;

            if (d1 == d2) {
                result++;
            }
        }

        return result;
    }
}

/*
1525. Number of Good Ways to Split a String
 */
