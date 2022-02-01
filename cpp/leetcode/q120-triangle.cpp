#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        vector<int> dp(triangle.back());

        int n = triangle.size();

        for (int i = n - 2; i >= 0; i--) {
            int m = triangle[i].size();

            for (int j = 0; j <= i; j++) {
                dp[j] = min(dp[j], dp[j + 1]) + triangle[i][j];
            }
        }

        return dp[0];
    }
};