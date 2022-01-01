package question;

import java.util.HashSet;
import java.util.Set;

public class Q217 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}

/*
217. Contains Duplicate
 */
