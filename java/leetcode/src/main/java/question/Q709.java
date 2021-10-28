package question;

import annotation.Strings;

@Strings
public class Q709 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] += 32;
            }
        }

        return new String(chars);
    }
}

/*
709. To Lower Case
 */
