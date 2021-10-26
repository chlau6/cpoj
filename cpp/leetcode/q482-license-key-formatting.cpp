#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string licenseKeyFormatting(string s, int k) {
        int count = 0;
        int length = s.size();
        string result = "";

        for (int i = length - 1; i >= 0; i--) {
            if (s[i] == '-') continue;

            if (count == k) {
                result.push_back('-');
                count = 0;
            }

            result.push_back((char) toupper(s[i]));
            count++;
        }

        return string(result.rbegin(), result.rend());
    }
};