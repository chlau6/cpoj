package question;

import java.util.HashMap;
import java.util.Map;

public class Q666 {
    int result = 0;
    Map<Integer, Integer> map = new HashMap<>();

    public int pathSum(int[] nums) {
        for (int num : nums) {
            int prefix = num / 10;
            int value = num % 10;

            map.put(prefix, value);
        }

        helper(nums[0] / 10, 0);
        return result;
    }

    public void helper(int key, int currSum) {
        int level = key / 10;
        int pos = key % 10;

        int left = (level + 1) * 10 + 2 * pos - 1;
        int right = left + 1;

        currSum += map.get(key);

        if (!map.containsKey(left) && !map.containsKey(right)) {
            result += currSum;
            return;
        }

        if (map.containsKey(left)) helper(left, currSum);
        if (map.containsKey(right)) helper(right, currSum);
    }
}

/*
666. Path Sum IV
 */
