package question;

import annotation.Array;
import annotation.HashTable;
import annotation.PrefixSum;

@Array
@HashTable
@PrefixSum
public class Q1893 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] line = new int[52];

        for (int[] r : ranges) {
            line[r[0]]++;
            line[r[1] + 1]--;
        }

        int overlap = 0;
        for (int i = left; i <= right; i++) {
            overlap += line[i];

            if (overlap == 0) return false;
        }

        return true;
    }
}

/*
1893. Check if All the Integers in a Range Are Covered
 */
