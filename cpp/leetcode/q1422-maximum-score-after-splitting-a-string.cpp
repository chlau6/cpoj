#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxScore(string s) {
        int zero = 0;
        int one = 0;
        int maxScore = INT_MIN;
        int length = s.size();

        for (int i = 0; i < length; i++) {
            if (s[i] == '0') {
                zero++;
            } else {
                one++;
            }

            if (i < length - 1) {
                maxScore = max(maxScore, zero - one);
            }
        }

        return maxScore + one;
    }
};