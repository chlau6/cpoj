package question;

import annotation.Array;
import annotation.CountingSort;
import annotation.Greedy;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Greedy
@Sorting
@CountingSort
public class Q561 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}

/*
561. Array Partition I
 */
