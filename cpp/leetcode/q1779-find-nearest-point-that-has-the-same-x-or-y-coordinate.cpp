#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int nearestValidPoint(int x, int y, vector<vector<int>>& points) {
        int minDist = INT_MAX;
        int n = points.size();
        int result = -1;

        for (int i = 0; i < n; i++) {
            if (x != points[i][0] && y != points[i][1]) continue;

            int dist = abs(x - points[i][0]) + abs(y - points[i][1]);

            if (dist < minDist) {
                minDist = dist;
                result = i;
            }
        }

        return result;
    }
};