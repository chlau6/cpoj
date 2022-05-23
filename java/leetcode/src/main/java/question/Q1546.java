package question;

import java.util.HashMap;
import java.util.Map;

public class Q1546 {
    public int maxNonOverlapping(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        map.put(0, 0);

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - target)) {
                result = Math.max(result, map.get(sum - target) + 1);
            }

            map.put(sum, result);
        }

        return result;
    }
}

/*
1546. Maximum Number of Non-Overlapping Subarrays With Sum Equals Target
 */
