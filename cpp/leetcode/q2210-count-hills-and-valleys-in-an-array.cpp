#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countHillValley(vector<int>& nums) {
        int result = 0;
        int n = nums.size();
        int start = 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;

            if (nums[start] < nums[i] && nums[i] > nums[i + 1] || nums[start] > nums[i] && nums[i] < nums[i + 1]) {
                result++;
            }

            start = i;
        }

        return result;
    }
};