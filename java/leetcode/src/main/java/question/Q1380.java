package question;

import java.util.ArrayList;
import java.util.List;

public class Q1380 {
    /*
    Time Complexity: O(mn)  Space Complexity: O(1)
     */
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int maxMin = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int rowMin = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rowMin = Math.min(rowMin, matrix[i][j]);
            }
            maxMin = Math.max(maxMin, rowMin);
        }

        int minMax = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int colMax = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                colMax = Math.max(colMax, matrix[i][j]);
            }
            minMax = Math.min(minMax, colMax);
        }

        return maxMin != minMax ? new ArrayList<>() : List.of(maxMin);
    }
}

/*
1380. Lucky Numbers in a Matrix
 */
