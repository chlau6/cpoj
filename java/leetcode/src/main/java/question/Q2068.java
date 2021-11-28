
package question;

import annotation.Counting;
import annotation.HashTable;
import annotation.Strings;

@HashTable
@Strings
@Counting
public class Q2068 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int n1 = word1.length();
        int n2 = word2.length();

        for (int i = 0; i < n1; i++) {
            c1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n2; i++) {
            c2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(c1[i] - c2[i]) > 3) return false;
        }

        return true;
    }
}
/*
2068. Check Whether Two Strings are Almost Equivalent
 */
