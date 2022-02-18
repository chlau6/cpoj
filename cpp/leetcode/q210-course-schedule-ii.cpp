#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<int> result;
        vector<vector<int>> graph(numCourses, vector<int>());
        vector<int> inDegree(numCourses);
        queue<int> queue;

        for (auto& pre : prerequisites) {
            graph[pre[1]].push_back(pre[0]);
            inDegree[pre[0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.push(i);
            }
        }

        while (!queue.empty()) {
            int node = queue.front();
            queue.pop();

            result.push_back(node);

            for (int v : graph[node]) {
                if (--inDegree[v] == 0) {
                    queue.push(v);
                }
            }
        }

        if (result.size() != numCourses) result.clear();

        return result;
    }
};