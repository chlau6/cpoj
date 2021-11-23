package question;

import annotation.Strings;

@Strings
public class Q1844 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        for (int i = 1; i < n; i += 2) {
            str[i] += str[i - 1] - '0';
        }

        return new String(str);
    }
}

/*
1844. Replace All Digits with Characters
 */
