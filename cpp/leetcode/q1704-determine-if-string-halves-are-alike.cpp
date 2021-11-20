#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool halvesAreAlike(string s) {
        int vowel = 0;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            char c = tolower(s[i]);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel = i >= n / 2 ? vowel + 1 : vowel - 1;
            }
        }

        return vowel == 0;
    }
};