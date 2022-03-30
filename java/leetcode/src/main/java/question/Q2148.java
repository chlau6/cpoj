package question;

import java.util.Arrays;

public class Q2148 {
    public int countElements(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int min = nums[0];
        int max = nums[n - 1];
        int result = 0;

        for (int num : nums) {
            if (min < num && num < max) {
                result++;
            }
        }

        return result;
    }
}
/*
2148. Count Elements With Strictly Smaller and Greater Elements
 */
