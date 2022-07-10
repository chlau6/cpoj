
package question;

public class Q665 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean change = false;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                if (change) {
                    return false;
                }

                change = true;

                if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }

        return true;
    }
}

/*
665. Non-decreasing Array
 */
