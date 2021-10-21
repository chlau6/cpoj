#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size()) return false;

        int counts[26] = {0};

        for (char& c : s) {
            counts[c - 'a']++;
        }

        for (char& c : t) {
            if (--counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
};