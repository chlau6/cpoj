#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canCross(vector<int>& stones) {
        int n = stones.size();
        unordered_map<int, unordered_set<int>> map;
        vector<int> dp(n);
        int k = 0;

        map[0].insert(0);

        for (int i = 1; i < n; i++) {
            while (dp[k] + 1 < stones[i] - stones[k]) {
                k++;
            }

            for (int j = k; j < i; j++) {
                int d = stones[i] - stones[j];

                if (map[j].count(d - 1) || map[j].count(d) || map[j].count(d + 1)) {
                    map[i].insert(d);
                    dp[i] = max(dp[i], d);
                }
            }
        }

        return dp[n - 1] > 0;
    }
};