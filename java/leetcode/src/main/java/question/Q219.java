package question;

import annotation.Array;
import annotation.HashTable;
import annotation.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

@Array
@HashTable
@SlidingWindow
public class Q219 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
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
