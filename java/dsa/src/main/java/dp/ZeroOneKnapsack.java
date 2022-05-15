package dp;

import java.util.ArrayList;
import java.util.List;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] value = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        int limit = 50;
        int objectNum = value.length;

        int[][] dp = new int[objectNum + 1][limit + 1];

        for (int i = 0; i <= objectNum; i++) {
            for (int j = 0; j <= limit; j++) {
                if (i == 0 || j == 0) continue;

                int objectWeight = weight[i - 1];
                int objectValue = value[i - 1];

                if (objectWeight <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - objectWeight] + objectValue);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        List<Integer> pickedObject = new ArrayList<>();
        int i = objectNum;
        int j = limit;

        while (i > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                pickedObject.add(i - 1);
                j -= weight[i - 1];
            }
            i--;
        }

        System.out.println(dp[objectNum][limit]);
        System.out.println(pickedObject);
    }
}
