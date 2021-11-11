package question;

import annotation.Strings;

@Strings
public class Q1422 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        int max = Integer.MIN_VALUE;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }

            if (i < length - 1) {
                max = Math.max(max, zero - one);
            }
        }

        return max + one;
    }
}

/*
1422. Maximum Score After Splitting a String
 */
