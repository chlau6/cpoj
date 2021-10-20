package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Maths;
import annotation.PrefixSum;
import company.Facebook;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@Maths
@PrefixSum
@Facebook
public class Q523 {
    /*
    Time Complexity: O(n)   Space Complexity: O(k)
     */
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
