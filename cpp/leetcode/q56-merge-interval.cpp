#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> result;

        sort(intervals.begin(), intervals.end());
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (auto& interval : intervals) {
            if (interval[0] <= end) {
                end = max(end, interval[1]);
            } else {
                result.push_back({start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        result.push_back({start, end});

        return result;
    }
};