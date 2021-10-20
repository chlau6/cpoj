package question;

import annotation.Array;

@Array
public class Q485 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int localMax = 0;
        int globalMax = 0;

        for (int num : nums) {
            if (num == 1) {
                globalMax = Math.max(++localMax, globalMax);
            } else {
                localMax = 0;
            }
        }

        return globalMax;
    }

}

/*
485. Max Consecutive Ones
 */
