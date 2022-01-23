package question;

public class Q747 {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max - secondMax >= secondMax ? index : -1;
    }
}

/*
747. Largest Number At Least Twice of Others
 */
