#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reformat(string s) {
        string chars;
        string integers;

        int length = s.size();

        for (auto& c : s) {
            if (isalpha(c)) {
                chars += c;
            } else {
                integers += c;
            }
        }

        if (abs(int(chars.size() - integers.size())) > 1) return "";

        int i = 0;
        int j = 0;
        int k = 0;
        bool isAlpha = chars.size() >= integers.size();

        while (i < length) {
            if (isAlpha) {
                s[i++] = chars[j++];
            } else {
                s[i++] = integers[k++];
            }

            isAlpha = !isAlpha;
        }

        return s;
    }
};