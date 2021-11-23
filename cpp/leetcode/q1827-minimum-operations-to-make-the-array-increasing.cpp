#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minOperations(vector<int>& nums) {
        int result = 0;
        int n = nums.size();

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                result += ++nums[i - 1] - nums[i];
                nums[i] = nums[i - 1];
            }
        }

        return result;
    }
};