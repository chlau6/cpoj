#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = nums.size();
        int result = INT_MAX;


        while (r < n) {
            sum += nums[r++];

            while (sum >= target) {
                result = min(result, r - l);
                sum -= nums[l++];
            }
        }

        return result == INT_MAX ? 0 : result;
    }
};