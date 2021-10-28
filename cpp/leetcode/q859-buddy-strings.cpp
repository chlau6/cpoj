#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool buddyStrings(string s, string goal) {
        int length = s.size();

        if (length != goal.size()) return false;

        if (s == goal) {
            unordered_set<char> set;
            for (int i = 0; i < length; i++) {
                set.insert(s[i]);
            }

            return set.size() < length;
        }

        vector<int> index;

        for (int i = 0; i < length; i++) {
            if (s[i] != goal[i]) {
                index.push_back(i);
            }
        }

        return index.size() == 2 && s[index[0]] == goal[index[1]] && s[index[1]] == goal[index[0]];
    }
};