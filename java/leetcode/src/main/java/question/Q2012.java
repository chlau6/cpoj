package question;

public class Q2012 {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] rightMin = new int[n];
        rightMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 2; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        }

        int maxLeft = nums[0];
        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > maxLeft && nums[i] < rightMin[i + 1]) {
                result += 2;
            } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                result++;
            }

            maxLeft = Math.max(maxLeft, nums[i]);
        }

        return result;
    }
}
/*
2012. Sum of Beauty in the Array
 */
