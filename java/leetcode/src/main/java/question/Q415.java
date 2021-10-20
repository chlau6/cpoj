package question;

import annotation.Maths;
import annotation.Simulation;
import annotation.Strings;
import company.Facebook;

@Maths
@Strings
@Simulation
@Facebook
public class Q415 {
    /*
    Time Complexity: O(max(m, n))   Space Complexity: O(max(m, n))
     */

    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0) {
            int digitSum = carry;
            if (i >= 0) {
                digitSum += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                digitSum += num2.charAt(j--) - '0';
            }

            builder.append(digitSum % 10);
            carry = digitSum / 10;
        }

        if (carry > 0) {
            builder.append(carry);
        }

        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Q415().addStrings("999", "1"));
    }
}

/*
415. Add Strings
 */
