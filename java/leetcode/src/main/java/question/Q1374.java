package question;

import annotation.Strings;

@Strings
public class Q1374 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String generateTheString(int n) {
        var builder = new StringBuilder();

        if (n % 2 == 0) {
            builder.append('a');
        }

        int end = n - builder.length();

        for (int i = 0; i < end; i++) {
            builder.append('b');
        }

        return builder.toString();
    }
}

/*
1374. Generate a String With Characters That Have Odd Counts
 */
