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
        int j = 0;
        int length = s.length();

        char[] result = s.toCharArray();

        for (int i = 0; i < length; i++, j++) {
            result[j] = result[i];

            if (j > 0 && result[j] == result[j - 1]) {
                j -= 2;
            }
        }

        return new String(result, 0, j);
    }
}

/*
1047. Remove All Adjacent Duplicates in String
 */
