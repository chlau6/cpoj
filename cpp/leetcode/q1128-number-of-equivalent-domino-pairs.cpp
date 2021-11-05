#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numEquivDominoPairs(vector<vector<int>>& dominoes) {
        unordered_map<int, int> map;

        for (auto d : dominoes) {
            int key = min(d[0], d[1]) * 10 + max(d[0], d[1]);
            map[key]++;
        }

        int result = 0;

        for (auto it : map) {
            result += it.second * (it.second - 1) / 2;
        }

        return result;
    }
};