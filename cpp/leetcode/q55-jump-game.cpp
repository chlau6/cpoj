#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i > index || index >= n - 1) break;
            index = max(index, i + nums[i]);
        }

        return index >= n - 1;
    }
};