#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        int n = nums.size();
        vector<int> dp(n);
        vector<int> next(n);
        vector<int> result;

        int maxSize = 0;
        int index = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    next[i] = j;

                    if (maxSize < dp[i]) {
                        maxSize = dp[i];
                        index = i;
                    }
                }
            }
        }

        for (int i = 0; i < maxSize; i++) {
            result.push_back(nums[index]);
            index = next[index];
        }

        return result;
    }
};