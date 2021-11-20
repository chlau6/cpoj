
package question;

import annotation.Array;
import annotation.Greedy;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Greedy
@Sorting
public class Q1710 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        for (int[] boxType : boxTypes) {
            int box = Math.min(boxType[0], truckSize);
            result += box * boxType[1];
            truckSize -= box;

            if (truckSize == 0) break;
        }

        return result;
    }
}

/*
1710. Maximum Units on a Truck
 */
