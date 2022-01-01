package question;

public class Q482 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String licenseKeyFormatting(String s, int k) {
        var builder = new StringBuilder();
        int count = 0;
        int length = s.length();

        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '-') continue;

            if (count == k) {
                builder.append('-');
                count = 0;
            }

            builder.append(Character.toUpperCase(c));
            count++;
        }

        return builder.reverse().toString();
    }
}

/*
482. License Key Formatting
 */
