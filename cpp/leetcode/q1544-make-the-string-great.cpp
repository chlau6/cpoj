#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string makeGood(string s) {
        int pos = 0;
        int length = s.size();

        for (int i = 0; i < length; i++) {
            if (pos > 0 && abs(s[i] - s[pos - 1]) == 32) {
                pos--;
            } else {
                s[pos++] = s[i];
            }
        }

        return s.substr(0, pos);
    }
};