package question;

public class Q2202 {
    public int maximumTop(int[] nums, int k) {
        if (nums.length == 1 && k % 2 == 1) return -1;

        int n = nums.length;
        int loop = Math.min(n, k - 1);
        int max = 0;

        for (int i = 0; i < loop; i++) {
            max = Math.max(max, nums[i]);
        }

        if (k < n) {
            max = Math.max(max, nums[k]);
        }

        return max;
    }
}

/*
2202. Maximize the Topmost Element After K Moves
 */
