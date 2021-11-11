#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        vector<int> result;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            result.insert(result.begin() + index[i], nums[i]);
        }

        return result;
    }
};