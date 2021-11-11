package question;

import annotation.Array;
import annotation.PrefixSum;

@Array
@PrefixSum
public class Q1413 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }

        return -min + 1;
    }
}

/*
1413. Minimum Value to Get Positive Step by Step Sum
 */
