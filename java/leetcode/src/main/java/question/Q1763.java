package question;

import java.util.Arrays;

public class Q1763 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n)
     */
    public String longestNiceSubstring(String s) {
        String result = "";
        char[] str = s.toCharArray();
        int n = str.length;

        for (int i = 0; i < n; i++) {
            boolean[] upper = new boolean[26];
            boolean[] lower = new boolean[26];

            for (int j = i; j < n; j++) {
                if (Character.isUpperCase(str[j])) {
                    upper[str[j] - 'A'] = true;
                } else {
                    lower[str[j] - 'a'] = true;
                }

                if (Arrays.equals(lower, upper) && j - i + 1 > result.length()) {
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }
}

/*
1763. Longest Nice Substring
 */
