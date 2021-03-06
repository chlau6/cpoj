package question;

public class Q121 {
    public int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minCost = Math.min(minCost, price);
            maxProfit = Math.max(maxProfit, price - minCost);
        }

        return maxProfit;
    }
}

/*
121. Best Time to Buy and Sell Stock
 */
