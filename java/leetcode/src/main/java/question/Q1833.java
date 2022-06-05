package question;

import java.util.Arrays;

public class Q1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        int n = costs.length;

        for (int i = 0; i < n; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];
            } else {
                return i;
            }
        }

        return n;
    }
}

/*
1833. Maximum Ice Cream Bars
 */
