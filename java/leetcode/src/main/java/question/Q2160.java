package question;

import java.util.Arrays;

public class Q2160 {
    public int minimumSum(int num) {
        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(nums);

        return (nums[0] * 10 + nums[2]) + (nums[1] * 10 + nums[3]);
    }
}

/*
2160. Minimum Sum of Four Digit Number After Splitting Digits
 */
