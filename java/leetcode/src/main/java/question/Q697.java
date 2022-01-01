package question;

import java.util.HashMap;
import java.util.Map;

public class Q697 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int findShortestSubArray(int[] nums) {
        int result = 0;
        int degree = 0;
        Map<Integer, Integer> startIndex = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            startIndex.putIfAbsent(nums[i], i);

            int c = count.get(nums[i]);

            if (c > degree) {
                degree = c;
                result = i - startIndex.get(nums[i]) + 1;
            } else if (c == degree) {
                result = Math.min(result, i - startIndex.get(nums[i]) + 1);
            }
        }

        return result;
    }
}

/*
697. Degree of an Array
 */
