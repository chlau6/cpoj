package question;

import annotation.Array;
import annotation.BinarySearch;
import annotation.TwoPointers;

@Array
@TwoPointers
@BinarySearch
public class Q167 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;

        while (head < tail) {
            int sum = numbers[head] + numbers[tail];
            if (sum == target) {
                return new int[] {head + 1, tail + 1};
            } else if (sum < target) {
                head++;
            } else {
                tail--;
            }
        }
        return new int[] {-1, -1};
    }
}

/*
167. Two Sum II - Input array is sorted
 */
