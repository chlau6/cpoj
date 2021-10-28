#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum = accumulate(nums.begin(), nums.end(), 0);
        int currSum = 0;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            if (sum - nums[i] == 2 * currSum) return i;

            currSum += nums[i];
        }

        return -1;
    }
};