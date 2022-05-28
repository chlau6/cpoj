package question;

import java.util.Arrays;

public class Q1657 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int n = word1.length();
        int[] o1 = new int[26];
        int[] o2 = new int[26];

        for (int i = 0; i < n; i++) {
            o1[word1.charAt(i) - 'a']++;
            o2[word2.charAt(i) - 'a']++;
        }

        Arrays.sort(o1);
        Arrays.sort(o2);

        for (int i = 0; i < 26; i++) {
            if (o1[i] != o2[i]) return false;
        }

        return true;
    }
}

/*
1657. Determine if Two Strings Are Close
 */
