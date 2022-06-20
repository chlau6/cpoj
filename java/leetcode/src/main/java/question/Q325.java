package question;

import java.util.HashMap;
import java.util.Map;

public class Q325 {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k) {
                result = i + 1;
            } else if (map.containsKey(sum - k)) {
                result = Math.max(result, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return result;
    }
}
/*
325. Maximum Size Subarray Sum Equals k
 */
