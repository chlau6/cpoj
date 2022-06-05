package question;

import java.util.Arrays;

public class Q1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        long sum = 0;
        int i = 0;
        int result = 1;

        for (int j = 0; j < n; j++) {
            sum += nums[j];

            while (sum + k < ((long) nums[j] * (j - i + 1))) {
                sum -= nums[i++];
            }

            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}

/*
1838. Frequency of the Most Frequent Element
 */
