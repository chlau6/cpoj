#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isNumber(string s) {
        int n = s.size();

        bool dot = false;
        bool e = false;
        bool num = false;

        for (int i = 0; i < n; i++) {
            if (isdigit(s[i])) {
                num = true;
            } else if (s[i] == '.') {
                if (e || dot) return false;
                dot = true;
            } else if (s[i] == 'e' || s[i] == 'E') {
                if (e || !num) return false;
                e = true;
                num = false;
            } else if (s[i] == '+' || s[i] == '-') {
                if (i > 0 && s[i - 1] != 'e' && s[i - 1] != 'E') return false;
            } else {
                return false;
            }
        }

        return num;
    }
};