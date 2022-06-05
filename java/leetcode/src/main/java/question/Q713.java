package question;

public class Q713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 0;
        int product = 1;
        int i = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            product *= nums[j];

            while (i <= j && product >= k) {
                product /= nums[i++];
            }

            result += (j - i + 1);
        }

        return result;
    }
}

/*
713. Subarray Product Less Than K
 */
