package question;

import java.util.TreeSet;

public class Q220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Long lowerBound = (long) nums[i] - t;
            Long num = set.ceiling(lowerBound);

            if (num != null && Math.abs(num - nums[i]) <= t) {
                return true;
            }

            set.add((long) nums[i]);

            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }

        return false;
    }
}

/*
220. Contains Duplicate III
 */
