package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Sorting;

import java.util.Arrays;

@Array
@HashTable
@Sorting
public class Q594 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int newStart = 0;
        int longest = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[start] > 1) start = newStart;
            if (nums[i] != nums[i - 1]) newStart = i;
            if (nums[i] - nums[start] == 1) longest = Math.max(longest, i - start + 1);
        }

        return longest;
    }
}

/*
594. Longest Harmonious Subsequence
 */
