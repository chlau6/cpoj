#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int globalMax = 1;
        int localMax = 1;
        int length = nums.size();

        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                globalMax = max(++localMax, globalMax);
            } else {
                localMax = 1;
            }
        }

        return globalMax;
    }
};