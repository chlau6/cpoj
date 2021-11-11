#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        vector<int> result;
        int sum = 0;
        int suffixSum = 0;
        int length = nums.size();

        sort(nums.begin(), nums.end());

        for (int num : nums) {
            sum += num;
        }

        for (int i = length - 1; i >= 0; i--) {
            result.push_back(nums[i]);
            suffixSum += nums[i];

            if (suffixSum * 2 > sum) break;
        }

        return result;
    }
};