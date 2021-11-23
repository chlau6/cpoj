#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countGoodSubstrings(string s) {
        int n = s.size();
        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            if (s[i] != s[i - 1] && s[i] != s[i + 1] && s[i - 1] != s[i + 1]) {
                result++;
            }
        }

        return result;
    }
};