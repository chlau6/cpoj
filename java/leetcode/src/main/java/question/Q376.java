package question;

public class Q376 {
    public int wiggleMaxLength(int[] nums) {
        int up = 1;
        int down = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }

        return Math.max(up, down);
    }
}

/*
376. Wiggle Subsequence
 */
