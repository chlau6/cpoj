package question;

public class Q915 {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int result = 0;
        int prevMax = nums[0];
        int currMax = nums[0];

        for (int i = 1; i < n; i++) {
            currMax = Math.max(currMax, nums[i]);

            if (nums[i] < prevMax) {
                result = i;
                prevMax = currMax;
            }
        }

        return result + 1;
    }
}

/*
915. Partition Array into Disjoint Intervals
 */
