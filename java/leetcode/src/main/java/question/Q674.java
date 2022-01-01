package question;

public class Q674 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findLengthOfLCIS(int[] nums) {
        int globalMax = 1;
        int localMax = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                globalMax = Math.max(++localMax, globalMax);
            } else {
                localMax = 1;
            }
        }

        return globalMax;
    }
}

/*
674. Longest Continuous Increasing Subsequence
 */
