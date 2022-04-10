#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> reconstructQueue(vector<vector<int>>& people) {
        int n = people.size();
        vector<vector<int>> result;

        sort(people.begin(), people.end(), [](vector<int>& a, vector<int>& b) {
            return a[0] == b[0] ? a[1] < b[1] : a[0] > b[0];
        });

        for (auto& p : people) {
            result.insert(result.begin() + p[1], p);
        }

        return result;
    }
};