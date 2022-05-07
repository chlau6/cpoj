#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numSplits(string s) {
        vector<int> c1(26);
        vector<int> c2(26);
        int n = s.size();
        int result = 0;
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < n; i++) {
            char c = s[i];

            d2 += (++c2[c - 'a'] == 1) ? 1 : 0;
        }

        for (int i = 0; i < n; i++) {
            char c = s[i];

            d2 -= (--c2[c - 'a'] == 0) ? 1 : 0;
            d1 += (++c1[c - 'a'] == 1) ? 1 : 0;

            if (d1 == d2) {
                result++;
            }
        }

        return result;
    }
};