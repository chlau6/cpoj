package question;

public class Q122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                result += (prices[i] - prices[i - 1]);
            }
        }

        return result;
    }
}

/*
122. Best Time to Buy and Sell Stock II
 */
