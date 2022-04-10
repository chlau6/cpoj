#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<double> calcEquation(vector<vector<string>>& equations, vector<double>& values, vector<vector<string>>& queries) {
        unordered_map<string, unordered_map<string, double>> graph;

        int m = equations.size();
        int n = queries.size();
        vector<double> result(n);

        for (int i = 0; i < m; i++) {
            string u = equations[i][0];
            string v = equations[i][1];

            graph[u][v] = values[i];
            graph[v][u] = 1.0 / values[i];
        }

        for (int i = 0; i < n; i++) {
            unordered_set<string> visited;

            string from = queries[i][0];
            string to = queries[i][1];

            result[i] = dfs(graph, visited, from, to);
        }

        return result;
    }

    double dfs(unordered_map<string, unordered_map<string, double>> graph, unordered_set<string> visited, string from, string to) {
        if (!graph.count(from)) return -1.0;

        if (graph[from].count(to)) return graph[from][to];

        visited.insert(from);

        for (auto entry : graph[from]) {
            string key = entry.first;
            double value = entry.second;

            if (visited.count(key)) continue;

            double product = dfs(graph, visited, key, to);

            if (product != -1.0) {
                return value * product;
            }
        }

        return -1.0;
    }
};