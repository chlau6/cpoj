package question;

public class Q2216 {
    public int minDeletion(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1] && (i - result) % 2 == 0) {
                result++;
            }
        }

        return result + (n - result) % 2;
    }
}

/*
2216. Minimum Deletions to Make Array Beautiful
 */
