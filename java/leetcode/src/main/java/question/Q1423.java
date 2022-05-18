package question;

public class Q1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int result = sum;

        for (int i = 0; i < k; i++) {
            sum = sum + cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
            result = Math.max(result, sum);
        }

        return result;
    }
}

/*
1750. Minimum Length of String After Deleting Similar Ends
 */
