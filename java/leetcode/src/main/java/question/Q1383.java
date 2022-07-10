package question;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q1383 {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = efficiency[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        long result = 0;
        int mod = 1000000007;

        for (int[] a : arr) {
            pq.add(a[1]);
            sum += a[1];

            if (pq.size() > k) sum -= pq.poll();
            result = Math.max(result, sum * a[0]);
        }

        return (int) (result % mod);
    }
}

/*
1383. Maximum Performance of a Team
 */
