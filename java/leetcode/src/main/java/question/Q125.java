package question;

import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
public class Q125 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!Character.isLetterOrDigit(i)) {
                i++;
            } else if (!Character.isLetterOrDigit(j)) {
                j--;
            } else if (c1 != c2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
/*
125. Valid Palindrome
 */