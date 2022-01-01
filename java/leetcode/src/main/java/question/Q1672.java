package question;

public class Q1672 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public int maximumWealth(int[][] accounts) {
        int result = 0;

        for (int[] account : accounts) {
            int sum = 0;

            for (int n : account) {
                sum += n;
            }

            result = Math.max(result, sum);
        }

        return result;
    }
}

/*
1672. Richest Customer Wealth
 */
