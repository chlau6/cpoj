package question;

public class Q1480 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}

/*
1480. Running Sum of 1d Array
 */
