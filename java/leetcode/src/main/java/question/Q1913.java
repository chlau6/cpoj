package question;

import annotation.Array;
import annotation.Sorting;

@Array
@Sorting
public class Q1913 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxProductDifference(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2 - min1 * min2;
    }
}

/*
1913. Maximum Product Difference Between Two Pairs
 */
