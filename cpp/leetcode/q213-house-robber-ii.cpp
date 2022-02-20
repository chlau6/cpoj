#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int rob(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];

        int n = nums.size();

        return max(rob(nums, 0, n - 1), rob(nums, 1, n));
    }

    int rob(vector<int>& nums, int left, int right) {
        if (right - left <= 1) return nums[left];

        vector<int> dp(right);

        dp[left] = nums[left];
        dp[left + 1] = max(nums[left], nums[left + 1]);

        for (int i = left + 2; i < right; i++) {
            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[right - 1];
    }
};