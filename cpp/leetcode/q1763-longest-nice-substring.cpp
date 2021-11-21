#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string longestNiceSubstring(string s) {
        string result;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            vector<bool> upper(26);
            vector<bool> lower(26);

            for (int j = i; j < n; j++) {
                if (isupper(s[j])) {
                    upper[s[j] - 'A'] = true;
                } else {
                    lower[s[j] - 'a'] = true;
                }

                if (equal(upper.begin(), upper.end(), lower.begin()) && j - i + 1 > result.size()) {
                    result = s.substr(i, j - i + 1);
                }
            }
        }

        return result;
    }
};