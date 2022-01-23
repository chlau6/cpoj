#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isScramble(string s1, string s2) {
        int n = s1.size();

        vector<vector<vector<bool>>> dp(n, vector<vector<bool>>(n, vector<bool>(n + 1)));

        for (int k = 1; k <= n; k++) {
            for (int i = 0; i + k <= n; i++) {
                for (int j = 0; j + k <= n; j++) {
                    if (k == 1) {
                        dp[i][j][k] = s1[i] == s2[j];
                        continue;
                    }

                    for (int c = 1; c < k; c++) {
                        if (dp[i][j][c] && dp[i + c][j + c][k - c] || dp[i][j + k - c][c] && dp[i + c][j][k - c]) {
                            dp[i][j][k] = true;
                            break;
                        }
                    }
                }
            }
        }

        return dp[0][0][n];
    }
};