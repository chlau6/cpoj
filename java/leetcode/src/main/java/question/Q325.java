package question;

import company.Facebook;

import java.util.HashMap;
import java.util.Map;

@Facebook
public class Q325 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                ans = i + 1;
            } else if (map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return ans;
    }
}
/*
325. Maximum Size Subarray Sum Equals k
 */
