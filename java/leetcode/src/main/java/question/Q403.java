package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q403 {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] dp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            map.put(i, new HashSet<>());
        }

        map.get(0).add(0);

        for (int i = 1; i < n; i++) {
            while (dp[k] + 1 < stones[i] - stones[k]) {
                k++;
            }

            for (int j = k; j < i; j++) {
                int d = stones[i] - stones[j];
                Set<Integer> jump = map.get(j);

                if (jump.contains(d - 1) || jump.contains(d) || jump.contains(d + 1)) {
                    map.get(i).add(d);
                    dp[i] = Math.max(dp[i], d);
                }
            }
        }

        return dp[n - 1] > 0;
    }
}

/*
403. Frog Jump
 */
