package question;

public class Q643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];

            if (i + 1 >= k) {
                max = Math.max(max, sum);
                sum -= nums[i - k + 1];
            }
        }

        return max * 1.0 / k;
    }
}

/*
643. Maximum Average Subarray I
 */
