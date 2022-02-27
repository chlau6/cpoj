#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> getSkyline(vector<vector<int>>& buildings) {
        int n = buildings.size();

        return helper(buildings, 0, n - 1);
    }

    vector<vector<int>> helper(vector<vector<int>>& skylines, int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;

            vector<vector<int>> left = helper(skylines, i, mid);
            vector<vector<int>> right = helper(skylines, mid + 1, j);

            return merge(left, right);
        }

        vector<vector<int>> result;

        result.push_back({skylines[i][0], skylines[i][2]});
        result.push_back({skylines[i][1], 0});

        return result;
    }

    vector<vector<int>> merge(vector<vector<int>>& r1, vector<vector<int>>& r2) {
        vector<vector<int>> result;

        int h1 = 0;
        int h2 = 0;
        int i = 0;
        int j = 0;
        int n1 = r1.size();
        int n2 = r2.size();

        while (i < n1 && j < n2) {
            int x1 = r1[i][0];
            int x2 = r2[j][0];
            int x;

            if (x1 < x2) {
                x = x1;
                h1 = r1[i][1];
                i++;
            } else if (x1 > x2) {
                x = x2;
                h2 = r2[j][1];
                j++;
            } else {
                x = x1;
                h1 = r1[i][1];
                h2 = r2[j][1];
                i++;
                j++;
            }

            int h = max(h1, h2);

            if (result.empty() || h != result.back()[1]) {
                result.push_back({x, h});
            }
        }

        while (i < n1) result.push_back(r1[i++]);
        while (j < n2) result.push_back(r2[j++]);

        return result;
    }
};