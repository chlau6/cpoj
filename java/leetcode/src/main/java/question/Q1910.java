package question;

public class Q1910 {
    public String removeOccurrences(String s, String part) {
        StringBuilder builder = new StringBuilder(s);
        int j = 0;
        int n = s.length();
        int m = part.length();

        for (int i = 0; i < n; i++) {
            builder.setCharAt(j++, s.charAt(i));

            if (j >= m && builder.substring(j - m, j).equals(part)) {
                j -= m;
            }
        }

        builder.setLength(j);

        return builder.toString();
    }
}

/*
1910. Remove All Occurrences of a Substring
 */
