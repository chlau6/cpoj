package question;

import annotation.Array;

@Array
public class Q1346 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return i > 0 && j < arr.length - 1 && i == j;
    }
}

/*
941. Valid Mountain Array
 */
