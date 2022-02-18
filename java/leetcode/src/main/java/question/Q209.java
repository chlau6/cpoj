package question;

public class Q209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = nums.length;
        int result = Integer.MAX_VALUE;


        while (r < n) {
            sum += nums[r++];

            while (sum >= target) {
                result = Math.min(result, r - l);
                sum -= nums[l++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}

/*
209. Minimum Size Subarray Sum
 */
