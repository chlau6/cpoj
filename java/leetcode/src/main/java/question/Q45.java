package question;

public class Q45 {
    /*
    Time Complexity: O(n^2 )   Space Complexity: O(1)
     */
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int result = 0;
        int curr = 0;
        int last = 0;

        for (int i = 0; i < n; i++) {
            curr = Math.max(curr, i + nums[i]);

            if (i == last) {
                last = curr;
                result++;
            }

            if (last >= n) {
                break;
            }
        }

        return result;
    }
}

/*
45. Jump Game II
 */
