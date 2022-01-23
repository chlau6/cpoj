#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> list;

        dfs(result, list, nums, 0, nums.size());

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& list, vector<int>& nums, int start, int n) {
        result.push_back(list);

        for (int i = start; i < n; i++) {
            list.push_back(nums[i]);

            dfs(result, list, nums, i + 1, n);

            list.pop_back();
        }
    }
};