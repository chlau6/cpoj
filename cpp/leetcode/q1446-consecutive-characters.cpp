#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxPower(string s) {
        int result = 1;
        int localMax = 1;
        int length = s.size();

        for (int i = 1; i < length; i++) {
            if (s[i] == s[i - 1]) {
                localMax++;
                result = max(result, localMax);
            } else {
                localMax = 1;
            }
        }

        return result;
    }
};