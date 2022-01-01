package question;

public class Q2022 {
    /*
    Time Complexity: O(k)   Space Complexity: O(mn)
     */
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;

        if (m * n != size) return new int[][]{};

        int[][] result = new int[m][n];

        for (int i = 0; i < size; i++) {
            result[i / n][i % n] = original[i];
        }

        return result;
    }
}
/*
2016. Maximum Difference Between Increasing Elements
 */
