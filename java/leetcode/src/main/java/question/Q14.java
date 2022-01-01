package question;

public class Q14 {
    /*
    Time Complexity: O(m * n)   Space Complexity: O(m)
     */
    public String longestCommonPrefix(String[] strs) {
        var builder = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
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
