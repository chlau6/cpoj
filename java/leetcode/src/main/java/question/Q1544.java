package question;

import annotation.Stacks;
import annotation.Strings;

@Strings
@Stacks
public class Q1544 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        int pos = 0;

        for (int i = 0; i < chars.length; i++) {
            if (pos > 0 && Math.abs(chars[i] - chars[pos - 1]) == 32) {
                pos--;
            } else {
                chars[pos++] = chars[i];
            }
        }

        return new String(chars, 0, pos);
    }
}

/*
1544. Make The String Great
 */
