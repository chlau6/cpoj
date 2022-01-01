package question;

import java.util.Arrays;

public class Q2062 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int countVowelSubstrings(String word) {
        int[] counts = new int[26];
        Arrays.fill(counts, -1);
        counts[0] = counts[4] = counts[8] = counts[14] = counts[20] = 0;

        int vowel = 0;
        int result = 0;
        int i = 0;
        int j = 0;
        int n = word.length();

        for (int k = 0; k < n; k++) {
            char c = word.charAt(k);

            if (counts[c - 'a'] >= 0) {
                if (++counts[c - 'a'] == 1) {
                    vowel++;
                }

                while (vowel == 5) {
                    char ch = word.charAt(j++);

                    if (--counts[ch - 'a'] == 0) {
                        vowel--;
                    }
                }

                result += j - i;
            } else {
                counts[0] = counts[4] = counts[8] = counts[14] = counts[20] = vowel = 0;
                i = j = k + 1;
            }
        }

        return result;
    }
}
/*
2062. Count Vowel Substrings of a String
 */
