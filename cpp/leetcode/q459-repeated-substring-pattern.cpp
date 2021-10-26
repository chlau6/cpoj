#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int length = s.size();

        for (int i = length / 2; i >= 1; i--) {
            if (length % i > 0) continue;

            int times = length / i;
            string result = "";

            for (int j = 0; j < times; j++) {
                result += s.substr(0, i);
            }

            if (result == s) return true;
        }

        return false;
    }
};