package question;

public class Q123 {
    /*
    Optimal
     */
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int secondBuy = Integer.MAX_VALUE;
        int firstSell = 0;
        int secondSell = 0;

        for (int price : prices) {
            firstBuy = Math.min(firstBuy, price);
            firstSell = Math.max(firstSell, price - firstBuy);
            secondBuy = Math.min(secondBuy, price - firstSell);
            secondSell = Math.max(secondSell, price - secondBuy);
        }

        return secondSell;
    }

    /*
    DP
     */
    public int maxProfit2(int[] prices) {
        int n = prices.length;
        int[][] localMax = new int[n][3];
        int[][] globalMax = new int[n][3];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 3; j++) {
                int diff = prices[i] - prices[i - 1];
                localMax[i][j] = Math.max(globalMax[i - 1][j - 1] + Math.max(diff, 0), localMax[i - 1][j] + diff);
                globalMax[i][j] = Math.max(globalMax[i - 1][j], localMax[i][j]);
            }
        }

        return globalMax[n - 1][2];
    }
}

/*
123. Best Time to Buy and Sell Stock III
 */
