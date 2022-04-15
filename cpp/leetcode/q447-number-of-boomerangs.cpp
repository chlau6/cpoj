#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numberOfBoomerangs(vector<vector<int>>& points) {
        int n = points.size();
        int result = 0;

        for (int i = 0; i < n; i++) {
            unordered_map<int, int> map;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];
                int dist = dy * dy + dx * dx;

                map[dist]++;
            }

            for (auto it : map) {
                result += it.second * (it.second - 1);
            }
        }

        return result;
    }
};