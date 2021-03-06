#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int result = nums[0];
        int maximum = nums[0];
        int minimum = nums[0];
        int n = nums.size();

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                swap(maximum, minimum);
            }

            maximum = max(nums[i], maximum * nums[i]);
            minimum = min(nums[i], minimum * nums[i]);
            result = max(result, maximum);
        }

        return result;
    }
};