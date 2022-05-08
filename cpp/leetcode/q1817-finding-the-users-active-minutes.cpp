#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findingUsersActiveMinutes(vector<vector<int>>& logs, int k) {
        unordered_map<int, unordered_set<int>> map;
        vector<int> result(k);

        for (auto& log : logs) {
            int user = log[0];
            int min = log[1];

            map[user].insert(min);
        }

        for (auto& entry : map) {
            int uam = entry.second.size();

            result[uam - 1]++;
        }

        return result;
    }
};