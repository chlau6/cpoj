#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minSteps(string s, string t) {
        int n = s.size();
        vector<int> count(26);
        int result = 0;

        for (int i = 0; i < n; i++) {
            char c1 = s[i];
            char c2 = t[i];

            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }

        for (int c : count) {
            if (c > 0) {
                result += c;
            }
        }

        return result;
    }
};