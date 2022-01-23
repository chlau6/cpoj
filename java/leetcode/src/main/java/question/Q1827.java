package question;

public class Q1827 {
    public int minOperations(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                result += ++nums[i - 1] - nums[i];
                nums[i] = nums[i - 1];
            }
        }

        return result;
    }
}

/*
1827. Minimum Operations to Make the Array Increasing
 */
