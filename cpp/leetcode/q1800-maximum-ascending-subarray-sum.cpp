#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int localMax = nums[0];
        int globalMax = localMax;
        int n = nums.size();

        for (int i = 1; i < n; i++) {
            localMax = (nums[i] > nums[i - 1]) ? localMax + nums[i] : nums[i];
            globalMax = max(globalMax, localMax);
        }

        return globalMax;
    }
};