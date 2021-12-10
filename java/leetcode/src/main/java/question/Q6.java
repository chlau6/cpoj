package question;

import annotation.Strings;

@Strings
public class Q6 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        var builder = new StringBuilder();
        int gap = 2 * numRows - 2;
        int n = s.length();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += gap) {
                builder.append(s.charAt(j));

                int k = j + gap - 2 * i;

                if (i != 0 && i != numRows - 1 && k < n) {
                    builder.append(s.charAt(k));
                }
            }
        }

        return builder.toString();
    }
}

/*
6. Zigzag Conversion
 */
