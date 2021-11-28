
package question;

import annotation.BinarySearch;
import annotation.Sorting;

import java.util.ArrayList;
import java.util.List;

@BinarySearch
@Sorting
public class Q2089 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int start = 0;

        for (int num : nums) {
            if (num == target) {
                count++;
            } else if (num < target) {
                start++;
            }
        }

        while (--count >= 0) {
            list.add(start++);
        }

        return list;
    }
}
/*
2089. Find Target Indices After Sorting Array
 */
