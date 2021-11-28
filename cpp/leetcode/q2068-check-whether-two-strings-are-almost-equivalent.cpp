#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkAlmostEquivalent(string word1, string word2) {
        vector<int> c1(26);
        vector<int> c2(26);

        for (char c : word1) {
            c1[c - 'a']++;
        }

        for (char c : word2) {
            c2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (abs(c1[i] - c2[i]) > 3) return false;
        }

        return true;
    }
};