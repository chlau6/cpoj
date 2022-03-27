#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkString(string s) {
        int n = s.size() - 1;

        for (int i = 0; i < n; i++) {
            if (s[i] > s[i + 1]) {
                return false;
            }
        }

        return true;
    }
};