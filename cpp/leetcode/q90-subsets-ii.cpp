#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        int n = nums.size();

        vector<vector<int>> result;
        vector<int> list;
        vector<bool> visited(n);

        sort(nums.begin(), nums.end());

        dfs(result, list, nums, visited, 0, n);

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& list, vector<int>& nums, vector<bool>& visited, int start, int n) {
        result.push_back(list);

        for (int i = start; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            list.push_back(nums[i]);

            dfs(result, list, nums, visited, i + 1, n);

            visited[i] = false;
            list.pop_back();
        }
    }
};