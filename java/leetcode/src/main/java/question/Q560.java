package question;

import java.util.HashMap;
import java.util.Map;

public class Q560 {
    /*
    Prefix Sum
     */
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Q560().subarraySum(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7));
    }
}

/*
560. Subarray Sum Equals K
 */
