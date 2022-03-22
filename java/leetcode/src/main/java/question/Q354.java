package question;

import java.util.Arrays;

public class Q354 {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;

        if (n < 2) return n;

        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);

        int[] dp = new int[n];
        int size = 0;

        for (int[] e : envelopes) {
            int left = 0;
            int right = size;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (dp[mid] < e[1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            dp[left] = e[1];
            if (left == size) {
                size++;
            }
        }

        return size;
    }
}

/*
354. Russian Doll Envelopes
 */
