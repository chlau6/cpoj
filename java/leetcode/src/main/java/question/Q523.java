package question;

import java.util.HashMap;
import java.util.Map;

public class Q523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);

                if (i - prevIndex > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
