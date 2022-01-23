package question;

public class Q896 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                increasing = true;
            } else if (nums[i - 1] > nums[i]) {
                decreasing = true;
            }

            if (increasing && decreasing) return false;
        }

        return true;
    }
}

/*
896. Monotonic Array
 */
