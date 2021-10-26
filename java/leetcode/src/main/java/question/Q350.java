package question;

import annotation.*;

import java.util.ArrayList;
import java.util.List;

@Array
@HashTable
@TwoPointers
@BinarySearch
@Sorting
public class Q350 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] counts = new int[1001];
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            counts[num]++;
        }

        for (int num : nums2) {
            if (--counts[num] >= 0) list.add(num);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

/*
350. Intersection of Two Arrays II
 */
