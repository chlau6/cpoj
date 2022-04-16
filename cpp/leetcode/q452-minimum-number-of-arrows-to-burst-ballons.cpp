#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        sort(points.begin(), points.end(), [](vector<int>& a, vector<int>& b) {
            return a[1] < b[1];
        });

        int result = 1;
        int n = points.size();
        int end = points[0][1];

        for (int i = 1; i < n; i++) {
            if (end >= points[i][0]) continue;

            result++;
            end = points[i][1];
        }

        return result;
    }
};