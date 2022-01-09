package question;

public class Q59 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n^2)
     */
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int top = 0;
        int bot = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        int total = n * n;

        while (count <= total) {
            for (int i = left; i <= right; i++) {
                result[top][i] = count++;
            }
            top++;

            for (int i = top; i <= bot; i++) {
                result[i][right] = count++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                result[bot][i] = count++;
            }
            bot--;

            for (int i = bot; i >= top; i--) {
                result[i][left] = count++;
            }
            left++;

        }

        return result;
    }
}

/*
59. Spiral Matrix II
 */
