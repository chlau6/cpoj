package question;

public class Q724 {
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
724. Find Pivot Index
 */
