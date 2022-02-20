#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> result;
        vector<int> list;

        dfs(result, list, k, n, 1);

        return result;
    }

    void dfs(vector<vector<int>> result, vector<int> list, int k, int n, int start) {
        if (list.size() > k || n < 0) return;

        if (list.size() == k && n == 0) {
            result.push_back(list);
        }

        for (int i = start; i <= 9; i++) {
            list.push_back(i);

            dfs(result, list, k, n - i, i + 1);

            list.pop_back();
        }
    }
};