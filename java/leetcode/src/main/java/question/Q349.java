package question;

import annotation.*;

import java.util.HashSet;
import java.util.Set;

@Array
@HashTable
@TwoPointers
@BinarySearch
@Sorting
public class Q349 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            if (s1.contains(num)) s2.add(num);
        }


        int[] ans = new int[s2.size()];
        int i = 0;

        for (int num : s2) {
            ans[i++] = num;
        }

        return ans;
    }
}

/*
349. Intersection of Two Arrays
 */
