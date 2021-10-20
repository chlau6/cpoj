package question;

import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
public class Q168 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();

        while (columnNumber > 0) {
            builder.append((char) (--columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return builder.reverse().toString();
    }
}

/*
168. Excel Sheet Column Title
 */
