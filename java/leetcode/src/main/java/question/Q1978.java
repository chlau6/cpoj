package question;

import java.util.Arrays;

public class Q1978 {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);

        int result = 1;

        for (int coin : coins) {
            if (coin > result) {
                break;
            }

            result += coin;
        }

        return result;
    }
}

/*
1798. Maximum Number of Consecutive Values You Can Make
 */
