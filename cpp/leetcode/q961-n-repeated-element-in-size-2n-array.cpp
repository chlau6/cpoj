#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int length = nums.size();

        for (int i = 2; i < length; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
                return nums[i];
            }
        }

        return nums[0];
    }
};