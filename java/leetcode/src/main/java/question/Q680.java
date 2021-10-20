package question;

import annotation.Greedy;
import annotation.Strings;
import annotation.TwoPointers;
import company.Facebook;

@TwoPointers
@Strings
@Greedy
@Facebook
public class Q680 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return helper(s, i + 1, j) || helper(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean helper(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

/*
680. Valid Palindrome II
 */
