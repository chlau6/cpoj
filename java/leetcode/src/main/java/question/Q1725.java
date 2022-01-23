package question;

public class Q1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int result = 0;

        for (int[] r : rectangles) {
            int largest = Math.min(r[0], r[1]);

            if (largest > maxLen) {
                maxLen = largest;
                result = 1;
            } else if (largest == maxLen) {
                result++;
            }
        }

        return result;
    }
}

/*
1725. Number Of Rectangles That Can Form The Largest Square
 */
