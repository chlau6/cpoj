#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> largeGroupPositions(string s) {
        vector<vector<int>> result;
        int length = s.size();

        int i = 0;
        int j = 0;

        while (j < length) {
            while (j < length && s[j] == s[i]) j++;
            if (j - i >= 3) result.push_back({i, j - 1});
            i = j;
        }

        return result;
    }
};