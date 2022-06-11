package question;

import java.util.Arrays;

public class Q1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};

        Arrays.sort(nums);

        int diff1 = nums[2] - nums[1];
        int diff2 = nums[1] - nums[0];

        int[] result = new int[2];

        if (diff1 == 2 || diff2 == 2) {
            return new int[]{1, nums[2] - nums[0] - 2};
        }

        int min = (diff1 > 1 ? 1 : 0) + (diff2 > 1 ? 1 : 0);

        return new int[]{min, nums[2] - nums[0] - 2};
    }
}

/*
1033. Moving Stones Until Consecutive
 */
