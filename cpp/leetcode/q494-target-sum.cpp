#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findTargetSumWays(vector<int>& nums, int target) {
        int n = nums.size();

        vector<unordered_map<int, int>> dp(n);

        return helper(dp, nums, target, 0);
    }

    int helper(vector<unordered_map<int, int>>& dp, vector<int>& nums, int target, int index) {
        if (index >= nums.size()) {
            return target == 0 ? 1 : 0;
        }

        if (dp[index].count(target)) {
            return dp[index][target];
        }

        int count1 = helper(dp, nums, target - nums[index], index + 1);
        int count2 = helper(dp, nums, target + nums[index], index + 1);

        return dp[index][target] = count1 + count2;
    }
};