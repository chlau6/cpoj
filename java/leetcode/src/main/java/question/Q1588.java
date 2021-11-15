package question;

import annotation.Array;
import annotation.Maths;
import annotation.PrefixSum;

@Array
@Maths
@PrefixSum
public class Q1588 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            sum += ((i + 1) * (length - i) + 1) / 2 * arr[i];
        }

        return sum;
    }
}

/*
1588. Sum of All Odd Length Subarrays
 */
