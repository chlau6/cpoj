#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findRightInterval(vector<vector<int>>& intervals) {
        vector<int> result;
        map<int, int> map;  // key: start, value: index
        int n = intervals.size();

        for (int i = 0; i < n; i++) {
            map[intervals[i][0]] = i;

        }

        for (auto interval : intervals) {
            auto it = map.lower_bound(interval[1]);

            if (it == map.end()) {
                result.push_back(-1);
            } else {
                result.push_back(it->second);
            }
        }

        return result;
    }
};