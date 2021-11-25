package question;

import annotation.Greedy;
import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
@Greedy
public class Q1903 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String largestOddNumber(String num) {
        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}

/*
1903. Largest Odd Number in String
 */
