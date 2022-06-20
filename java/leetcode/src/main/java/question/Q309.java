package question;

public class Q309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int n = prices.length;
        int hold = -prices[0];
        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0;

        for (int i = 1; i < n; i++) {
            int originalHold = hold;
            int originalSell = sell;

            hold = Math.max(buy, hold);
            sell = prices[i] + Math.max(buy, originalHold);
            buy = cooldown - prices[i];
            cooldown = Math.max(cooldown, originalSell);
        }

        return Math.max(cooldown, sell);
    }
}

/*
309. Best Time to Buy and Sell Stock with Cooldown
 */
