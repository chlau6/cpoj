package question;

import java.util.HashMap;
import java.util.Map;

public class Q1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int result = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                Map<Integer, Integer> map = new HashMap<>();

                map.put(0, 1);

                int curr = 0;

                for (int k = 0; k < m; k++) {
                    curr += matrix[k][j] - (i > 0 ? matrix[k][i - 1] : 0);
                    result += map.getOrDefault(curr - target, 0);
                    map.put(curr, map.getOrDefault(curr, 0) + 1);
                }
            }
        }

        return result;
    }
}

/*
1074. Number of Submatrices That Sum to Target
 */
