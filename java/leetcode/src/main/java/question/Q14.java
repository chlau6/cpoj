package question;

import annotation.Strings;

@Strings
public class Q14 {
    /*
    Time Complexity: O(m * n)   Space Complexity: O(m)
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != c) {
                    return builder.toString();
                }
            }
            builder.append(c);
        }
        return builder.toString();
    }
}

/*
14. Longest Common Prefix
 */
