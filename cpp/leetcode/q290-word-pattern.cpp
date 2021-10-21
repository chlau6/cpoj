#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> map;
        unordered_set<string> set;
        istringstream in(s);

        int i = 0;
        int n = pattern.size();

        for (string word; in >> word; i++) {
            if (i > n) return false;

            if (!map.count(pattern[i])) {
                if (set.count(word)) return false;
                map[pattern[i]] = word;
                set.insert(word);
            } else if (map[pattern[i]] != word) {
                return false;
            }
        }

        return i == n;
    }
};