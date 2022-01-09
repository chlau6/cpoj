#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        vector<vector<int>> result;

        vector<int> a = newInterval;

        for (auto& interval : intervals) {
            if (interval[1] < a[0]) {
                result.push_back(interval);
            } else if (interval[0] > a[1]) {
                result.push_back(a);
                a = interval;
            } else {
                a[0] = min(a[0], interval[0]);
                a[1] = max(a[1], interval[1]);
            }
        }

        result.push_back(a);

        return result;
    }
};