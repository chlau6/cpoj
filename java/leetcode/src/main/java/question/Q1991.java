package question;

public class Q1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < n; i++) {
            if (2 * leftSum == sum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
/*
1984. Minimum Difference Between Highest and Lowest of K Scores
 */
