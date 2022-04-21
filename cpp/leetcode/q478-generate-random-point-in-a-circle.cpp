#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    double r;
    double x;
    double y;

    Solution(double radius, double x_center, double y_center) {
        r = radius;
        x = x_center;
        y = y_center;
    }

    vector<double> randPoint() {
        double theta = 2 * M_PI * ((double) rand() / RAND_MAX);
        double length = sqrt((double) rand() / RAND_MAX) * r;

        return {x + length * cos(theta), y + length * sin(theta)};
    }
};