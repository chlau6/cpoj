package question;

import annotation.Array;
import annotation.TwoPointers;

@Array
@TwoPointers
public class Q1089 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public void duplicateZeros(int[] arr) {
        int zero = 0;

        for (int num : arr) {
            if (num == 0) zero++;
        }

        int i = arr.length - 1;
        int j = arr.length + zero - 1;

        while (i < j) {
            if (arr[i] != 0) {
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
                j--;
                if (j < arr.length) arr[j] = arr[i];
            }

            i--;
            j--;
        }
    }
}

/*
1089. Duplicate Zeros
 */
