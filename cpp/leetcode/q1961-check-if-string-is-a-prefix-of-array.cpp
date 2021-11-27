#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isPrefixString(string s, vector<string>& words) {
        int n = s.size();
        int i = 0;

        for (string word : words) {
            for (char c : word) {
                if (i == n || s[i++] != c) {
                    return false;
                }
            }

            if (i == n) return true;
        }

        return false;
    }
};