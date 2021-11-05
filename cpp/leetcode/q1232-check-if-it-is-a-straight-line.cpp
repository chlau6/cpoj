#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];

        int dx = x1 - x0;
        int dy = y1 - y0;

        for (auto c : coordinates) {
            int x = c[0];
            int y = c[1];

            if (dy * (x - x0) != dx * (y - y0)) return false;
        }

        return true;
    }
};