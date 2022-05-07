package question;

import java.util.Arrays;

public class Q1877 {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int result = 0;

        Arrays.sort(nums);

        while (i < j) {
            result = Math.max(result, nums[i++] + nums[j--]);
        }

        return result;
    }
}
/*
1877. Minimize Maximum Pair Sum in Array
 */
