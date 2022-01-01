package question;

public class Q1909 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (++count == 2) return false;

                if (i > 1 && nums[i - 2] >= nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}

/*
1909. Remove One Element to Make the Array Strictly Increasing
 */
