#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string originalDigits(string s) {
        string result;
        vector<int> counts(26);
        vector<int> digits(10);
        int n = s.size();

        for (char c : s) {
            counts[c - 'a']++;
        }

        digits[0] = counts['z' - 'a'];
        digits[2] = counts['w' - 'a'];
        digits[4] = counts['u' - 'a'];
        digits[6] = counts['x' - 'a'];
        digits[8] = counts['g' - 'a'];
        digits[1] = counts['o' - 'a'] - digits[0] - digits[2] - digits[4];
        digits[3] = counts['h' - 'a'] - digits[8];
        digits[5] = counts['f' - 'a'] - digits[4];
        digits[7] = counts['s' - 'a'] - digits[6];
        digits[9] = counts['i' - 'a'] - digits[5] - digits[6] - digits[8];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < digits[i]; j++) {
                result += (i + '0');
            }
        }

        return result;
    }
};