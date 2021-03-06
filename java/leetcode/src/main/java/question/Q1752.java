package question;

public class Q1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if (count > 1) return false;
        }

        return true;
    }
}

/*
1752. Check if Array Is Sorted and Rotated
 */
