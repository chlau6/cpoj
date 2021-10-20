package question;

import annotation.BitManipulation;
import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
@BitManipulation
public class Q67 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int firstDigit = i >= 0 ? a.charAt(i--) - '0' : 0;
            int secondDigit = j >= 0 ? b.charAt(j--) - '0' : 0;

            int sum = firstDigit + secondDigit + carry;
            builder.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            builder.append("1");
        }

        return builder.reverse().toString();
    }
}

/*
67. Add Binary
 */
