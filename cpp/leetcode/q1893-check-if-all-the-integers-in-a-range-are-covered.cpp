#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isCovered(vector<vector<int>>& ranges, int left, int right) {
        vector<int> line(52);

        for (auto r : ranges) {
            line[r[0]]++;
            line[r[1] + 1]--;
        }

        for (int i = 1; i < 52; i++) {
            line[i] += line[i - 1];
        }

        for (int i = left; i <= right; i++) {
            if (line[i] == 0) return false;
        }

        return true;
    }
};