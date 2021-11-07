package question;

import annotation.Strings;

@Strings
public class Q1309 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String freqAlphabets(String s) {
        var builder = new StringBuilder();

        int length = s.length();
        char[] c = s.toCharArray();
        int i = 0;

        while (i < length) {
            if (i + 2 < length && c[i + 2] == '#') {
                builder.append((char) ('j' + (c[i] - '1') * 10 + c[i + 1] - '0'));
                i += 3;
            } else {
                builder.append((char) ('a' + c[i] - '1'));
                i++;
            }
        }

        return builder.toString();
    }
}

/*
1309. Decrypt String from Alphabet to Integer Mapping
 */
