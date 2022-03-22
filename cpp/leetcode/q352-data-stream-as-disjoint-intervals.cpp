#include<bits/stdc++.h>

using namespace std;

class SummaryRanges {
public:
    vector<vector<int>> intervals;

    SummaryRanges() {

    }

    void addNum(int val) {
        vector<int> newInterval = {val, val};

        int i = 0;
        int n = intervals.size();
        int overlap = 0;

        while (i < n) {
            if (newInterval[1] + 1 < intervals[i][0]) break;

            if (newInterval[0] <= intervals[i][1] + 1) {
                newInterval[0] = min(newInterval[0], intervals[i][0]);
                newInterval[1] = max(newInterval[1], intervals[i][1]);
                overlap++;
            }

            i++;
        }

        if (overlap > 0) {
            intervals.erase(intervals.begin() + i - overlap, intervals.begin() + i);
        }

        intervals.insert(intervals.begin() + i - overlap, newInterval);
    }

    vector<vector<int>> getIntervals() {
        return intervals;
    }
};