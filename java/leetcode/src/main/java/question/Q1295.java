package question;

import annotation.Array;

@Array
public class Q1295 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1000 && num <= 9999 || num == 100000) {
                ans++;
            }
        }
        return ans;
    }

    /*
    Time Complexity: O(n log (max(num)))    Space Complexity: O(1)
     */
    public int findNumbers2(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int digit = 0;
            while (num > 0) {
                num /= 10;
                digit++;
            }
            ans += digit % 2 == 0 ? 1 : 0;
        }
        return ans;
    }
}

/*
1295. Find Numbers with Even Number of Digit
 */
