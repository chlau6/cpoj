#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string truncateSentence(string s, int k) {
        int n = s.size();
        string result;

        for (int i = 0; i < n; i++) {
            if (s[i] == ' ' && --k == 0) {
                return s.substr(0, i);
            }
        }

        return s;
    }
};