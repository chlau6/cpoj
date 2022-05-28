package question;

public class Q775 {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (Math.abs(i - nums[i]) > 1) return false;
        }

        return true;
    }
}

/*
775. Global and Local Inversions
 */

