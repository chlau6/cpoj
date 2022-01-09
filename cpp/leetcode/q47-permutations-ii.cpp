#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> list;
        vector<bool> isUsed(nums.size());

        sort(nums.begin(), nums.end());

        recursion(result, list, nums, isUsed);

        return result;
    }

    void recursion(vector<vector<int>>& result, vector<int>& list, vector<int>& nums, vector<bool>& isUsed) {
        if (list.size() == nums.size()) {
            result.push_back(list);
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (isUsed[i] || (i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1])) continue;

            list.push_back(nums[i]);
            isUsed[i] = true;

            recursion(result, list, nums, isUsed);

            list.pop_back();
            isUsed[i] = false;
        }
    }
};