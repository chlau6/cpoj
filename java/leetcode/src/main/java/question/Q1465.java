package question;

import java.util.Arrays;

public class Q1465 {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int m = horizontalCuts.length;
        int n = verticalCuts.length;
        int mod = 1000000007;

        long horMax = 0;
        long verMax = 0;
        for (int i = 0; i <= m; i++) {
            int prev = (i == 0) ? 0 : horizontalCuts[i - 1];
            int curr = (i == m) ? h : horizontalCuts[i];

            horMax = Math.max(horMax, curr - prev);
        }

        for (int j = 0; j <= n; j++) {
            int prev = (j == 0) ? 0 : verticalCuts[j - 1];
            int curr = (j == n) ? w : verticalCuts[j];

            verMax = Math.max(verMax, curr - prev);
        }

        return (int) (horMax * verMax % mod);
    }
}

/*
1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */
