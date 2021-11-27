package question;

import annotation.Array;
import annotation.Enumeration;

import java.util.HashMap;
import java.util.Map;

@Array
@Enumeration
public class Q1995 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n^2)
     */
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int b = 1; b < n - 2; b++) {
            for (int a = 0; a < b; a++) {
                int sum = nums[a] + nums[b];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            for (int d = b + 2; d < n; d++) {
                result += map.getOrDefault(nums[d] - nums[b + 1], 0);
            }
        }

        return result;
    }
}
/*
1995. Count Special Quadruplets
 */
