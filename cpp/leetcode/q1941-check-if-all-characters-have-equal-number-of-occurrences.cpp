#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool areOccurrencesEqual(string s) {
        vector<int> counts(26);

        for (char c : s) {
            counts[c - 'a']++;
        }

        int prev = counts[s[0] - 'a'];

        for (int count : counts) {
            if (count != 0 && count != prev) return false;
        }

        return true;
    }
};