package question;

public class Q1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(i - start);

            if (result <= diff) break;

            if (nums[i] == target) {
                result = diff;
            }
        }

        return result;
    }
}

/*
1848. Minimum Distance to the Target Element
 */
