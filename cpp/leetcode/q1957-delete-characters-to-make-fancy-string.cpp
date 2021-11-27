#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string makeFancyString(string s) {
        int n = s.size();
        int j = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            count = s[i] == s[i - 1] ? count + 1 : 1;

            if (count < 3) {
                s[j++] = s[i];
            }
        }

        return s.substr(0, j);
    }
};