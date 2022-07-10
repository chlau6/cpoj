package question;

public class Q1763 {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        char[] str = s.toCharArray();
        int n = str.length;
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];

        for (char c : str) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            char c = str[i];

            char upperChar = Character.toUpperCase(c);
            char lowerChar = Character.toLowerCase(c);

            if (upper[upperChar - 'A'] && lower[lowerChar - 'a']) continue;

            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            return left.length() >= right.length() ? left : right;
        }

        return s;
    }
}

/*
1763. Longest Nice Substring
 */
