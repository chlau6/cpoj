#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        bool increasing = false;
        bool decreasing = false;
        int length = nums.size();

        for (int i = 1; i < length; i++) {
            if (nums[i - 1] < nums[i]) {
                increasing = true;
            } else if (nums[i - 1] > nums[i]) {
                decreasing = true;
            }

            if (increasing && decreasing) return false;
        }

        return true;
    }
};