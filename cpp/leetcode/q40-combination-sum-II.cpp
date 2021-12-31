#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> list;

        sort(candidates.begin(), candidates.end());

        recursion(result, list, candidates, 0, target);

        return result;
    }

    void recursion(vector<vector<int>>& result, vector<int>& list, vector<int>& candidates, int start, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.push_back(list);
            return;
        }

        for (int i = start; i < candidates.size(); i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            list.push_back(candidates[i]);

            recursion(result, list, candidates, i + 1, target - candidates[i]);

            list.pop_back();
        }
    }
};