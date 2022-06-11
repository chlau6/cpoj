package question;

public class Q1004 {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int result = 0;
        int zero = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[i] == 0) {
                    zero--;
                }

                i++;
            }

            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}

/*
1004. Max Consecutive Ones III
 */
