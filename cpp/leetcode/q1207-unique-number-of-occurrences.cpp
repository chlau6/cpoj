#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> map;
        unordered_set<int> set;

        for (int num : arr) {
            map[num]++;
        }

        for (auto it : map) {
            if (!set.insert(it.second).second) return false;
        }

        return true;
    }
};