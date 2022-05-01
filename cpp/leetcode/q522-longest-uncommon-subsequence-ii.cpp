#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findLUSlength(vector<string>& strs) {
        int result = 0;
        int n = strs.size();
        unordered_set<string> set;

        sort(strs.begin(), strs.end(), [](string a, string b) {
            return a.size() == b.size() ? a > b : a.size() > b.size();
        });

        for (int i = 0; i < n; i++) {
            if (i == n - 1 || strs[i] != strs[i + 1]) {
                bool found = true;

                for (auto s : set) {
                    int j = 0;
                    int len = strs[i].size();

                    for (char c : s) {
                        if (c == strs[i][j]) j++;
                        if (j == len) break;
                    }

                    if (j == len) {
                        found = false;
                        break;
                    }
                }

                if (found) return strs[i].size();
            }

            set.insert(strs[i]);
        }

        return -1;
    }
};