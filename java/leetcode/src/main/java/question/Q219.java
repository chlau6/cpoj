package question;

import java.util.HashSet;
import java.util.Set;

public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) return true;
            if (i >= k) set.remove(nums[i - k]);
        }
        return false;
    }
}

/*
219. Contains Duplicate II
 */
