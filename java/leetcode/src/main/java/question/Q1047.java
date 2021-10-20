package question;

import annotation.Stacks;
import annotation.Strings;
import company.Facebook;

@Strings
@Stacks
@Facebook
public class Q1047 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        int j = 0;
        int i = 0;
        int len = s.length();

        while (i < len) {
            chars[j] = chars[i];

            if (j > 0 && chars[j] == chars[j - 1]) {
                j -= 2;
            }

            i++;
            j++;
        }

        return new String(chars, 0, j);
    }
}

/*
1047. Remove All Adjacent Duplicates in String
 */
