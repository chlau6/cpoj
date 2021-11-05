package question;

import annotation.Array;
import annotation.Greedy;
import annotation.Maths;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Maths
@Greedy
@Sorting
public class Q976 {
    /*
    Time Complexity: O(n log n)  Space Complexity: O(n)
     */
    public int largestPerimeter(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (a + b > c && a + c > b && b + c > a) return a + b + c;
        }

        return 0;
    }
}

/*
976. Largest Perimeter Triangle
 */
