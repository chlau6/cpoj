package question;

import annotation.Array;
import annotation.DynamicProgramming;
import company.Facebook;

@Array
@DynamicProgramming
@Facebook
public class Q123 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int buy1 = Integer.MAX_VALUE;
        int sell1 = Integer.MIN_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int sell2 = Integer.MIN_VALUE;

        for (int price : prices) {
            buy1 = Math.min(buy1, price);
            sell1 = Math.max(sell1, price - buy1);
            buy2 = Math.min(buy2, price - sell1);
            sell2 = Math.max(sell2, price - buy2);
        }

        return sell2;
    }
}

/*
123. Best Time to Buy and Sell Stock III
 */
