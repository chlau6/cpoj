#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> list;
        vector<bool> isUsed(nums.size());

        recursion(result, list, nums, isUsed);

        return result;
    }

    void recursion(vector<vector<int>>& result, vector<int>& list, vector<int>& nums, vector<bool>& isUsed) {
        if (list.size() == nums.size()) {
            result.push_back(list);
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (isUsed[i]) continue;

            list.push_back(nums[i]);
            isUsed[i] = true;

            recursion(result, list, nums, isUsed);

            list.pop_back();
            isUsed[i] = false;
        }
    }
};