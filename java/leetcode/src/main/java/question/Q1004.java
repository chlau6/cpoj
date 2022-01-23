package question;

public class Q1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0 && nums[left++] == 0) {
                k++;
            }
        }

        return right - left;
    }


}

/*
1004. Max Consecutive Ones III
 */
