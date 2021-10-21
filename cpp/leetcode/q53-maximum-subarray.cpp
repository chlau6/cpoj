#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int localMax = 0;
        int globalMax = INT_MIN;

        for (auto num : nums) {
            localMax = max(localMax + num, num);
            globalMax = max(globalMax, localMax);
        }

        return globalMax;
    }
};