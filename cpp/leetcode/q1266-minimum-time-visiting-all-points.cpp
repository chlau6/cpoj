#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minTimeToVisitAllPoints(vector<vector<int>>& points) {
        int result = 0;
        int length = points.size();

        for (int i = 0; i < length - 1; i++) {
            int x0 = points[i][0];
            int y0 = points[i][1];
            int x1 = points[i + 1][0];
            int y1 = points[i + 1][1];

            int xDiff = abs(x0 - x1);
            int yDiff = abs(y0 - y1);

            result += max(xDiff, yDiff);
        }

        return result;
    }
};