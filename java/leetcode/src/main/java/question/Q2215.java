
package question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 2; i++) {
            result.add(new ArrayList<>());
        }

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                result.get(0).add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                result.get(1).add(num);
            }
        }

        return result;
    }
}

/*
2215. Find the Difference of Two Arrays
 */
