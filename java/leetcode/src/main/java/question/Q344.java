package question;

import annotation.Recursion;
import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
@Recursion
public class Q344 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}

/*
344. Reverse String
 */
