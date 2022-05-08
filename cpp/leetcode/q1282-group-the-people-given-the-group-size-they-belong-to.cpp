#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        int n = groupSizes.size();
        vector<vector<int>> result;
        vector<vector<int>> map(n + 1);

        for (int i = 0; i < n; i++) {
            int g = groupSizes[i];

            map[g].push_back(i);

            if (map[g].size() == g) {
                result.push_back(map[g]);
                map[g].clear();
            }
        }

        return result;
    }
};