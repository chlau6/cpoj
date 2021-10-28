#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> shortestToChar(string s, char c) {
        int length = s.length();
        vector<int> result(length, length);

        for (int i = 0; i < length; i++) {
            if (s[i] == c) {
                result[i] = 0;
            } else if (i > 0) {
                result[i] = result[i - 1] + 1;
            }
        }

        for (int i = length - 2; i >= 0; i--) {
            if (s[i] != c) {
                result[i] = min(result[i], result[i + 1] + 1);
            }
        }

        return result;
    }
};