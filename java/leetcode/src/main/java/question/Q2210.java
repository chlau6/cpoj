package question;

public class Q2210 {
    public int countHillValley(int[] nums) {
        int result = 0;
        int n = nums.length;
        int start = 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;

            if (nums[start] < nums[i] && nums[i] > nums[i + 1] || nums[start] > nums[i] && nums[i] < nums[i + 1]) {
                result++;
            }

            start = i;
        }

        return result;
    }
}

/*
2210. Count Hills and Valleys in an Array
 */
