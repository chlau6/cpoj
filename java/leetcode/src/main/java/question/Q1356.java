package question;

import java.util.Arrays;

public class Q1356 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = countBit(arr[i]) * 10001 + arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }

        return arr;
    }

    public int countBit(int num) {
        int count = 0;

        while (num != 0) {
            count += (num & 1);
            num >>= 1;
        }

        return count;
    }
}

/*
1356. Sort Integers by The Number of 1 Bits
 */
