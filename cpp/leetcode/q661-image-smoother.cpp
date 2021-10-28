#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> imageSmoother(vector<vector<int>>& img) {
        vector<vector<int>> dirs {{-1, 1}, {0, 1}, {1, 1}, {-1, 0}, {0, 0}, {1, 0}, {-1, -1}, {0, -1}, {1, -1}};

        int m = img.size();
        int n = img[0].size();
        vector<vector<int>> result(m, vector<int>(n));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (auto dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];

                    if (x < 0 || y < 0 || x == m || y == n) continue;

                    sum += img[x][y];
                    count++;
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
};