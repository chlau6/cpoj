#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> findSubsequences(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> list;

        dfs(result, list, nums, 0);

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& list, vector<int>& nums, int index) {
        if (list.size() > 1) {
            result.push_back(list);
        }

        int n = nums.size();
        unordered_set<int> set;

        for (int i = index; i < n; i++) {
            if (!list.empty() && nums[i] < list.back() || set.count(nums[i])) continue;

            list.push_back(nums[i]);
            set.insert(nums[i]);

            dfs(result, list, nums, i + 1);

            list.pop_back();
        }
    }
};