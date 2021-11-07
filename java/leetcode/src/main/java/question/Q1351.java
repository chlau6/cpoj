package question;

import annotation.Array;
import annotation.BinarySearch;
import annotation.Matrix;

@Array
@BinarySearch
@Matrix
public class Q1351 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r = m - 1;
        int c = 0;
        int result = 0;

        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                result += (n - c);
                r--;
            } else {
                c++;
            }
        }

        return result;
    }
}

/*
1351. Count Negative Numbers in a Sorted Matrix
 */
