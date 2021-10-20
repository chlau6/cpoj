package question;

import annotation.Array;
import annotation.Maths;

@Array
@Maths
public class Q66 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

/*
66. Plus One
 */
