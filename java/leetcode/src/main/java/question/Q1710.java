package question;

import java.util.Arrays;

public class Q1710 {
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
