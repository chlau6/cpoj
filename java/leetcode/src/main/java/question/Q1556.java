package question;

import annotation.Strings;

@Strings
public class Q1556 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(log n)
     */
    public String thousandSeparator(int n) {
        if (n == 0) return "0";

        int i = 0;
        var builder = new StringBuilder();

        while (n > 0) {
            if (i > 0 && i % 3 == 0) {
                builder.append('.');
            }

            builder.append(n % 10);
            n /= 10;
            i++;
        }

        return builder.reverse().toString();
    }
}

/*
1556. Thousand Separator
 */
