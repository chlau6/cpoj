package question;

import annotation.Array;
import annotation.Sorting;

@Array
@Sorting
public class Q414 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }

        return (secondMax == Long.MIN_VALUE || thirdMax == Long.MIN_VALUE) ? (int) firstMax : (int) thirdMax;
    }
}

/*
414. Third Maximum Number
 */
