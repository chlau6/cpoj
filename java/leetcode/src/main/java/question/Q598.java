package question;

import annotation.Array;
import annotation.Maths;

@Array
@Maths
public class Q598 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] o : ops) {
            m = Math.min(m, o[0]);
            n = Math.min(n, o[1]);
        }

        return m * n;
    }
}

/*
598. Range Addition II
 */
