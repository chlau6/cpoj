package question;

import java.util.Arrays;

public class Q462 {
    public int minMoves2(int[] nums) {
        int result = 0;
        int i = 0;
        int j = nums.length - 1;

        Arrays.sort(nums);

        while (i < j) {
            result += nums[j--] - nums[i++];
        }

        return result;
    }
}

/*
462. Minimum Moves to Equal Array Elements II
 */
