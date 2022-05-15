#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        vector<vector<int>> result;

        vector<int> path = {0};

        dfs(result, path, graph, 0);

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& path, vector<vector<int>>& graph, int node) {
        if (node == graph.size() - 1) {
            result.push_back(path);
        }

        for (int v : graph[node]) {
            path.push_back(v);

            dfs(result, path, graph, v);

            path.pop_back();
        }
    }
};