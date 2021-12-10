#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> pos(128, -1);
        int n = s.size();
        int start = -1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int j = s[i];

            start = max(start, pos[j]);
            result = max(result, i - start);
            pos[j] = i;
        }

        return result;
    }
};