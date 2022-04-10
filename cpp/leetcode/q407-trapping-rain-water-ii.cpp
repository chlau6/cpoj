#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    struct Compare {
        bool operator()(vector<int>& a, vector<int>& b) {
            return a[0] < b[0];
        }
    };

    int trapRainWater(vector<vector<int>>& heightMap) {
        int m = heightMap[0];
        int n = heightMap[1];
        int level = INT_MIN;
        int result = 0;
        
        priority_queue<vector<int>, vector<vector<int>>, Compare> pq;
        vector<vector<bool>> visited(m, vector<bool>(n));
        vector<int> dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m || j == n) {
                    pq.push({heightMap[i][j], i * n + j});
                    visited[i][j] = true;
                }
            }
        }

        while (!pq.empty()) {
            vector<int>& top = pq.top();
            pq.pop();

            int height = top[0];
            int row = top[1] / n;
            int col = top[1] % n;

            level = max(level, height);

            for (auto& d : dir) {
                int x = d[0] + row;
                int y = d[1] + col;

                if (x < 0 || y < 0 || x == m || y == n || visited[x][y]) continue;

                visited[x][y] = true;

                if (heightMap[x][y] < level) {
                    result += level - heightMap[x][y];
                }

                pq.push({height, x * n + y});
            }
        }

        return result;
    }
};