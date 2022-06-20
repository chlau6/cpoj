package question;

import java.util.HashMap;
import java.util.Map;

public class Q1695 {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        int n = nums.length;
        int i = 0;

        for (int j = 0; j < n; j++) {
            sum += nums[j];

            if (map.containsKey(nums[j])) {
                int pos = map.get(nums[j]);

                while (i <= pos) {
                    sum -= nums[i++];
                }
            }

            result = Math.max(result, sum);

            map.put(nums[j], j);
        }

        return result;
    }
}

/*
1695. Maximum Erasure Value
 */
