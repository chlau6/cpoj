#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>> result;
        vector<int> list;

        dfs(result, list, 1, n, k);

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& list, int start, int n, int k) {
        if (list.size() == k) {
            result.push_back(list);
        }

        for (int i = start; i <= n; i++) {
            list.push_back(i);

            dfs(result, list, i + 1, n, k);

            list.pop_back();
        }
    }
};