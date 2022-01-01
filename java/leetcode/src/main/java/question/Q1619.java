package question;

import java.util.Arrays;

public class Q1619 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public double trimMean(int[] arr) {
        Arrays.sort(arr);

        int start = arr.length / 20;
        int end = arr.length - start;
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

        return sum * 1.0 / (arr.length - 2 * start);
    }
}

/*
1619. Mean of Array After Removing Some Elements
 */
