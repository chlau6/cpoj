package question;

public class Q1793 {
    public int maximumScore(int[] nums, int k) {
        int result = nums[k];
        int min = nums[k];
        int i = k;
        int j = k;

        int n = nums.length;

        while (i > 0 || j < n - 1) {
            if (i == 0) {
                j++;
            } else if (j == n - 1) {
                i--;
            } else if (nums[i - 1] < nums[j + 1]) {
                j++;
            } else {
                i--;
            }

            min = Math.min(min, Math.min(nums[i], nums[j]));
            result = Math.max(result, min * (j - i + 1));
        }

        return result;
    }
}

/*
1793. Maximum Score of a Good Subarray
 */
