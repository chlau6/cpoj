#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        int n = nums.size();
        int result = 0;
        vector<unordered_map<int, int>> dp(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long delta = (long) nums[i] - nums[j];

                if (delta < INT_MIN || delta > INT_MAX) continue;

                int diff = (int) delta;

                dp[i][diff]++;

                if (dp[j].count(diff)) {
                    int count = dp[j][diff];
                    result += count;
                    dp[i][diff] += count;
                }
            }
        }

        return result;
    }
};