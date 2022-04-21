#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool makesquare(vector<int>& matchsticks) {
        if (matchsticks.size() < 4) return false;

        int sum = 0;
        int n = matchsticks.size();

        for (int m : matchsticks) {
            sum += m;
        }

        if (sum % 4 != 0) return false;

        sort(matchsticks.rbegin(), matchsticks.rend());
        vector<int> sums(4);

        return dfs(matchsticks, sums, 0, sum / 4);
    }

    bool dfs(vector<int>& matchsticks, vector<int> sums, int pos, int target) {
        if (pos >= matchsticks.size()) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sums[i] + matchsticks[pos] > target) continue;
            sums[i] += matchsticks[pos];

            if (dfs(matchsticks, sums, pos + 1, target)) return true;
            sums[i] -= matchsticks[pos];
        }

        return false;
    }
};