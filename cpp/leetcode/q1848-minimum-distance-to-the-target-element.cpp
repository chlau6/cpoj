#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int n = nums.size();
        int result = INT_MAX;

        for (int i = 0; i < n; i++) {
            int diff = abs(i - start);

            if (result <= diff) break;

            if (nums[i] == target) {
                result = diff;
            }
        }

        return result;
    }
};