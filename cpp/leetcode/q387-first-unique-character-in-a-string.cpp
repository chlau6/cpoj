#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int firstUniqChar(string s) {
        vector<int> counts(26);
        int length = s.size();

        for (auto& c : s) {
            counts[c - 'a']++;
        }

        for (int i = 0; i < length; i++) {
            if (counts[s[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
};