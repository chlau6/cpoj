#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool kLengthApart(vector<int>& nums, int k) {
        int pos = -1;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) continue;

            if (pos != -1 && i - pos - 1 < k) return false;

            pos = i;
        }

        return true;
    }
};