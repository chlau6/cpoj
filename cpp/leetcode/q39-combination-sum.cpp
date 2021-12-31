#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
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
            if (candidates[i] > target) break;

            list.push_back(candidates[i]);

            recursion(result, list, candidates, i, target - candidates[i]);

            list.pop_back();
        }
    }
};