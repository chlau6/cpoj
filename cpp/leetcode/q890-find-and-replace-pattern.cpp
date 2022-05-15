#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        vector<string> result;

        for (auto word : words) {
            if (isMatch(word, pattern)) {
                result.push_back(word);
            }
        }

        return result;
    }

    bool isMatch(string word, string pattern) {
        if (word.size() != pattern.size()) return false;

        unordered_map<char, char> m1;
        unordered_map<char, char> m2;

        int n = word.size();

        for (int i = 0; i < n; i++) {
            char c1 = word[i];
            char c2 = pattern[i];

            if (!m1.count(c1)) {
                m1[c1] = c2;
            }

            if (!m2.count(c2)) {
                m2[c2] = c1;
            }

            if (m1[c1] != c2 || m2[c2] != c1) return false;
        }

        return true;
    }
};