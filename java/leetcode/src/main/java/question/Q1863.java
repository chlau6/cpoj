package question;

import annotation.*;

@Array
@Maths
@Backtracking
@BitManipulation
@Combinatorics
public class Q1863 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int result = 0;

        for (int num : nums) {
            result |= num;
        }

        return result * (1 << n - 1);
    }
}

/*
1863. Sum of All Subset XOR Totals
 */
