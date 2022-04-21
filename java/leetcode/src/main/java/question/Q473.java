package question;

import java.util.Arrays;

public class Q473 {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) return false;

        int sum = 0;
        int n = matchsticks.length;

        for (int m : matchsticks) {
            sum += m;
        }

        if (sum % 4 != 0) return false;

        Arrays.sort(matchsticks);
        int[] sums = new int[4];

        return dfs(matchsticks, sums, n - 1, sum / 4);
    }

    public boolean dfs(int[] matchsticks, int[] sums, int pos, int target) {
        if (pos < 0) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sums[i] + matchsticks[pos] > target) continue;
            sums[i] += matchsticks[pos];

            if (dfs(matchsticks, sums, pos - 1, target)) return true;
            sums[i] -= matchsticks[pos];
        }

        return false;
    }
}

/*
473. Matchsticks to Square
 */
