package question;

import java.util.HashMap;
import java.util.Map;

public class Q1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int result = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] prefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            prefixSum[i][0] = matrix[i][0];

            for (int j = 1; j < n; j++) {
                prefixSum[i][j] = prefixSum[i][j - 1] + matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int curr = 0;

                for (int k = 0; k < m; k++) {
                    curr += prefixSum[k][j] - (i > 0 ? prefixSum[k][i - 1] : 0);
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
