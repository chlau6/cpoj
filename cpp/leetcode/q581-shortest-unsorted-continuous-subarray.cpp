#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        int n = nums.size();
        int minimum = INT_MAX;
        int maximum = INT_MIN;
        int start = -1;
        int end = -2;

        for (int i = 0; i < n; i++) {
            maximum = max(maximum, nums[i]);

            if (maximum > nums[i]) {
                end = i;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            minimum = min(minimum, nums[i]);

            if (minimum < nums[i]) {
                start = i;
            }
        }

        return end - start + 1;
    }
};