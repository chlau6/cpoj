package question;

import annotation.Maths;

@Maths
public class Q728 {
    /*
    Time Complexity: O(n log m)   Space Complexity: O(n)
     */
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int currSum = 0;

        for (int num : nums) sum += num;

        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] == 2 * currSum) return i;

            currSum += nums[i];
        }

        return -1;
    }
}

/*
728. Self Dividing Numbers
 */
