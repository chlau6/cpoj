#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int timestamp = 1;

    vector<vector<int>> criticalConnections(int n, vector<vector<int>>& connections) {
        vector<vector<int>> result;
        vector<vector<int>> graph;
        vector<int> low(n);
        vector<int> time(n);

        for (int i = 0; i < n; i++) {
            graph.push_back({});
        }

        for (auto& connection : connections) {
            int u = connection[0];
            int v = connection[1];

            graph[u].push_back(v);
            graph[v].push_back(u);
        }

        helper(result, graph, time, low, -1, 0);

        return result;
    }

    void helper(vector<vector<int>>& result, vector<vector<int>>& graph, vector<int>& time, vector<int>& low, int prev, int curr) {
        time[curr] = low[curr] = timestamp++;

        for (int v : graph[curr]) {
            if (time[v] == 0) {
                helper(result, graph, time, low, curr, v);
                low[curr] = min(low[curr], low[v]);
            } else if (v != prev) {
                low[curr] = min(low[curr], time[v]);
            }

            if (low[v] > time[curr]) {
                result.push_back({curr, v});
            }
        }
    }
};