package question;

import java.util.ArrayList;

public class Q514 {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length();

        ArrayList<Integer>[] pos = new ArrayList[26];
        int[][] memo = new int[n][m];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            char c = ring.charAt(i);
            pos[c - 'a'].add(i);
        }

        return dfs(pos, memo, ring, key, 0, 0);
    }

    public int dfs(ArrayList<Integer>[] pos, int[][] memo, String ring, String key, int x, int y) {
        if (y == key.length()) return 0;

        if (memo[x][y] != 0) return memo[x][y];

        int result = Integer.MAX_VALUE;
        int n = ring.length();
        char c = key.charAt(y);

        for (int k : pos[c - 'a']) {
            int diff = Math.abs(x - k);
            int step = Math.min(diff, n - diff);

            result = Math.min(result, step + dfs(pos, memo, ring, key, k, y + 1));
        }

        return memo[x][y] = result + 1;
    }
}

/*
514. Freedom Trail
 */