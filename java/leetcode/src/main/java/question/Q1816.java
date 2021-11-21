package question;

import annotation.Array;
import annotation.Strings;

@Array
@Strings
public class Q1816 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public String truncateSentence(String s, int k) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ' && --k == 0) {
                return s.substring(0, i);
            }
        }

        return s;
    }
}

/*
1816. Truncate Sentence
 */
