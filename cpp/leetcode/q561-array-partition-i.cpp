#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int length = nums.size();
        int sum = 0;

        sort(nums.begin(), nums.end());

        for (int i = 0; i < length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
};