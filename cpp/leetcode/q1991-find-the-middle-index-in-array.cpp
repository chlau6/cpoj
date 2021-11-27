#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int sum = 0;
        int leftSum = 0;
        int n = nums.size();

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < n; i++) {
            if (2 * leftSum == sum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
};