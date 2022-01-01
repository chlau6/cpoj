package question;

public class Q961 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int repeatedNTimes(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
                return nums[i];
            }
        }

        return nums[0];
    }
}

/*
961. N-Repeated Element in Size 2N Array
 */
