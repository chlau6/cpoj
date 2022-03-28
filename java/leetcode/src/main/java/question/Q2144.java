package question;

import java.util.Arrays;

public class Q2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int n = cost.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 != n % 3) {
                result += cost[i];
            }
        }

        return result;
    }
}
/*
2144. Minimum Cost of Buying Candies With Discount
 */
