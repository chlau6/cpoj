package question;

public class Q152 {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maximum = nums[0];
        int minimum = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maximum;
                maximum = minimum;
                minimum = temp;
            }

            maximum = Math.max(nums[i], maximum * nums[i]);
            minimum = Math.min(nums[i], minimum * nums[i]);
            result = Math.max(result, maximum);
        }

        return result;
    }
}

/*
152. Maximum Product Subarray
 */
