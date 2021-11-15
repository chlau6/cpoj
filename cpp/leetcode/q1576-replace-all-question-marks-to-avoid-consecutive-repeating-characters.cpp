#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string modifyString(string s) {
        int length = s.size();

        for (int i = 0; i < length; i++) {
            if (s[i] != '?') continue;

            for (char j = 'a'; j < 'd'; j++) {
                if (i > 0 && s[i - 1] == j) continue;

                if (i + 1 < length && s[i + 1] == j) continue;

                s[i] = j;

                break;
            }
        }

        return s;
    }
};