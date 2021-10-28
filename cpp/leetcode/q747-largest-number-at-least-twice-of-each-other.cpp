#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int max = INT_MIN;
        int secondMax = INT_MIN;
        int index = 0;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (long) max - secondMax >= secondMax ? index : -1;
    }
};