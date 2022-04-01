#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isRectangleCover(vector<vector<int>>& rectangles) {
        int x1 = INT_MAX;
        int y1 = INT_MAX;
        int x2 = INT_MIN;
        int y2 = INT_MIN;

        unordered_set<string> set;
        long area = 0;

        for (auto& r : rectangles) {
            x1 = min(r[0], x1);
            y1 = min(r[1], y1);
            x2 = max(r[2], x2);
            y2 = max(r[3], y2);

            area += (long) (r[2] - r[0]) * (r[3] - r[1]);

            string s1 = to_string(r[0]) + " " + to_string(r[1]);
            string s2 = to_string(r[0]) + " " + to_string(r[3]);
            string s3 = to_string(r[2]) + " " + to_string(r[1]);
            string s4 = to_string(r[2]) + " " + to_string(r[3]);

            if (set.count(s1)) set.erase(s1); else set.insert(s1);
            if (set.count(s2)) set.erase(s2); else set.insert(s2);
            if (set.count(s3)) set.erase(s3); else set.insert(s3);
            if (set.count(s4)) set.erase(s4); else set.insert(s4);
        }

        string s1 = to_string(x1) + " " + to_string(y1);
        string s2 = to_string(x1) + " " + to_string(y2);
        string s3 = to_string(x2) + " " + to_string(y1);
        string s4 = to_string(x2) + " " + to_string(y2);

        if (!set.count(s1) || !set.count(s2) || !set.count(s3) || !set.count(s4) || set.size() != 4) return false;

        return area == (long) (x2 - x1) * (y2 - y1);
    }
};