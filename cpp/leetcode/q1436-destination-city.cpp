#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_set<string> set;

        for (auto& path : paths) {
            set.insert(path[1]);
        }

        for (auto& path : paths) {
            set.erase(path[0]);
        }

        return *set.begin();
    }
};