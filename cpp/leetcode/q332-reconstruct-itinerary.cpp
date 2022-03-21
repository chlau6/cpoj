#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findItinerary(vector<vector<string>>& tickets) {
        unordered_map<string, priority_queue<string, vector<string>, greater<string>>> graph;
        vector<string> result;

        for (auto& ticket : tickets) {
            graph[ticket[0]].push(ticket[1]);
        }

        dfs(graph, result, "JFK");

        reverse(result.begin(), result.end());

        return result;
    }

    void dfs(unordered_map<string, priority_queue<string, vector<string>, greater<string>>>& graph, vector<string>& result, string airport) {
        while (graph.count(airport) && !graph[airport].empty()) {
            string next = graph[airport].top();
            graph[airport].pop();

            dfs(graph, result, next);
        }

        result.push_back(airport);
    }
};