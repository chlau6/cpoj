#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        vector<bool> allow(26);
        int result = words.size();

        for (auto c : allowed) {
            allow[c - 'a'] = true;
        }

        for (auto word : words) {
            for (auto c : word) {
                if (!allow[c - 'a']) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }
};