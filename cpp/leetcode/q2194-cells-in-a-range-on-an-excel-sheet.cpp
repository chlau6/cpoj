#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> cellsInRange(string s) {
        vector<string> result;

        for (char i = s[0]; i <= s[3]; i++) {
            for (char j = s[1]; j <= s[4]; j++) {
                result.push_back({i, j});
            }
        }

        return result;
    }
};