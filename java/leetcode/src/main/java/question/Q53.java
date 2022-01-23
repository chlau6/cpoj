package question;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for (int num : nums) {
            localMax = Math.max(localMax + num, num);
            globalMax = Math.max(localMax, globalMax);
        }

        return globalMax;
    }
}

/*
53. Maximum Subarray
 */