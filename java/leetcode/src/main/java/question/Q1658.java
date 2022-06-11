package question;

public class Q1658 {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        int n = nums.length;
        for (int num : nums) {
            target += num;
        }

        if (target == 0) return n;

        int maxLength = -1;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            sum += nums[j];

            while (i < j && sum > target) {
                sum -= nums[i];
                i++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength == 0 ? -1 : n - maxLength;
    }
}

/*
1658. Minimum Operations to Reduce X to Zero
 */
