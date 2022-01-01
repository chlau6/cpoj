package question;

public class Q1122 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counts = new int[1001];

        for (int num : arr1) {
            counts[num]++;
        }

        int i = 0;

        for (int num : arr2) {
            while (--counts[num] >= 0) {
                arr1[i++] = num;
            }
        }

        for (int j = 0; j < 1001; j++) {
            while (--counts[j] >= 0) {
                arr1[i++] = j;
            }
        }

        return arr1;
    }
}

/*
1122. Relative Sort Array
 */
