package question;

public class Q1417 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public String reformat(String s) {
        var result = new StringBuilder();

        var chars = new StringBuilder();
        var integers = new StringBuilder();

        int length = s.length();

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                chars.append(c);
            } else {
                integers.append(c);
            }
        }

        if (Math.abs(chars.length() - integers.length()) > 1) return "";

        int i = 0;
        int j = 0;
        int k = 0;
        boolean isAlpha = chars.length() >= integers.length();

        while (i < length) {
            if (isAlpha) {
                result.append(chars.charAt(j++));
            } else {
                result.append(integers.charAt(k++));
            }

            isAlpha = !isAlpha;
            i++;
        }

        return result.toString();
    }
}

/*
1417. Reformat The String
 */
