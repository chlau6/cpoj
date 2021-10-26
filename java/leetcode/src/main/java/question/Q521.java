package question;

import annotation.Strings;

@Strings
public class Q521 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}

/*
521. Longest Uncommon Subsequence I
 */
