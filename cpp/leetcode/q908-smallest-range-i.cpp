#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int maxNum = INT_MIN;
        int minNum = INT_MAX;

        for (int num : nums) {
            maxNum = max(maxNum, num);
            minNum = min(minNum, num);
        }

        return max(0, maxNum - minNum - 2 * k);
    }
};