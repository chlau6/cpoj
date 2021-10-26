#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findLHS(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        int length = nums.size();
        int start = 0;
        int newStart = 0;
        int longest = 0;

        for (int i = 1; i < length; i++) {
            if (nums[i] - nums[start] > 1) start = newStart;
            if (nums[i] != nums[i - 1]) newStart = i;
            if (nums[i] - nums[start] == 1) longest = max(longest, i - start + 1);
        }

        return longest;
    }
};