#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countBinarySubstrings(string s) {
        int result = 0;
        int prev = 0;
        int curr = 1;
        int length = s.size();

        for (int i = 1; i < length; i++) {
            if (s[i] == s[i - 1]) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }

            if (prev >= curr) result++;
        }

        return result;
    }
};