#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        int left = 0;
        int maxLength = 1;
        vector<vector<bool>> dp(n, vector<bool>(n));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] = s[i] == s[j] && (i - j < 3 || dp[j + 1][i - 1]);

                if (dp[j][i] && i - j + 1 > maxLength) {
                    left = j;
                    maxLength = i - j + 1;
                }
            }
        }

        return s.substr(left, maxLength);
    }
};