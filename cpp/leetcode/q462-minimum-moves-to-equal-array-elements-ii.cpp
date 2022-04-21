#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minMoves2(vector<int>& nums) {
        int result = 0;
        int i = 0;
        int j = nums.size() - 1;

        sort(nums.begin(), nums.end());

        while (i < j) {
            result += nums[j--] - nums[i++];
        }

        return result;
    }
};