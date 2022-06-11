package question;

public class Q1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] ^= arr[i - 1];
        }

        int m = queries.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

            result[i] = from > 0 ? arr[to] ^ arr[from - 1] : arr[to];
        }

        return result;
    }
}

/*
1310. XOR Queries of a Subarray
 */
