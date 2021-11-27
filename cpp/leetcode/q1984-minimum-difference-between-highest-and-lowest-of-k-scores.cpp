#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        int n = nums.size();
        int result = INT_MAX;

        sort(nums.begin(), nums.end());

        for (int i = k - 1; i < n; i++) {
            result = min(result, nums[i] - nums[i - k + 1]);
        }

        return result;
    }
};