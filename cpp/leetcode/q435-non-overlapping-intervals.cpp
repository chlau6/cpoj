#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](vector<int>& a, vector<int>& b) {
            return a[1] < b[1];
        });

        int n = intervals.size();
        int result = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < prevEnd) {
                result++;
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return result;
    }
};