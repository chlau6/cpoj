#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> counts(26);

        for (auto& c : magazine) {
            counts[c - 'a']++;
        }

        for (auto& c : ransomNote) {
            if (--counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
};