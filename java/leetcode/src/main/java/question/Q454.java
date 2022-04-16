package question;

import java.util.HashMap;
import java.util.Map;

public class Q454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                map.compute(n1 + n2, (k, v) -> v == null ? 1 : v + 1);
            }
        }

        for (int n1 : nums3) {
            for (int n2 : nums4) {
                int target = -(n1 + n2);

                result += map.getOrDefault(target, 0);
            }
        }

        return result;
    }
}

/*
454. 4Sum II
 */
