
package question;

import annotation.DynamicProgramming;
import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
@DynamicProgramming
public class Q392 {
    /*
    Time Complexity: O(max(m, n))    Space Complexity: O(1)
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int sLength = s.length();
        int tLength = t.length();

        for (int j = 0; i < sLength && j < tLength; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
        }

        return i == sLength;
    }
}

/*
392. Is Subsequence
 */
