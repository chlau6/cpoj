#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findMinHeightTrees(int n, vector<vector<int>>& edges) {
        if (n == 1) return {0};

        vector<int> result;
        queue<int> queue;
        vector<int> inDegree(n);
        vector<vector<int>> graph(n, vector<int>());

        for (auto& edge : edges) {
            graph[edge[0]].push_back(edge[1]);
            graph[edge[1]].push_back(edge[0]);
            inDegree[edge[0]]++;
            inDegree[edge[1]]++;
        }

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 1) {
                queue.push(i);
            }
        }

        while (!queue.empty()) {
            vector<int> list;
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                int node = queue.front();
                queue.pop();

                list.push_back(node);

                for (auto& v : graph[node]) {
                    if (--inDegree[v] == 1) {
                        queue.push(v);
                    }
                }
            }

            result = list;
        }

        return result;
    }
};