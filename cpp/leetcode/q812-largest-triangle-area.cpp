#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    double largestTriangleArea(vector<vector<int>>& points) {
        double result = 0;
        int length = points.size();

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    int x1 = points[i][0];
                    int x2 = points[j][0];
                    int x3 = points[k][0];
                    int y1 = points[i][1];
                    int y2 = points[j][1];
                    int y3 = points[k][1];

                    double area = abs(0.5 * ((x2 * y3 - x3 * y2) - (x1 * y3 - x3 * y1) + (x1 * y2 - x2 * y1)));

                    result = max(result, area);
                }
            }
        }

        return result;
    }
};