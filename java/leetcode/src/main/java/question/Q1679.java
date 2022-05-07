package question;

import java.util.Arrays;

public class Q1679 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int result = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                result++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}

/*
1679. Max Number of K-Sum Pairs
 */
