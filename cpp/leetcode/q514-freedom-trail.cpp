#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findRotateSteps(string ring, string key) {
        int n = ring.size();
        int m = key.size();
        vector<vector<int>> pos(26);
        vector<vector<int>> memo(n, vector<int>(m));

        for (int i = 0; i < n; i++) {
            pos[ring[i] - 'a'].push_back(i);
        }

        return dfs(pos, memo, ring, key, 0, 0);
    }

    int dfs(vector<vector<int>>& pos, vector<vector<int>>& memo, string ring, string key, int x, int y) {
        if (y == key.size()) return 0;

        if (memo[x][y] != 0) return memo[x][y];

        int result = INT_MAX;
        int n = ring.size();

        for (int k : pos[key[y] - 'a']) {
            int diff = abs(x - k);
            int step = min(diff, n - diff);

            result = min(result, step + dfs(pos, memo, ring, key, k, y + 1));
        }

        return memo[x][y] = result + 1;
    }
};