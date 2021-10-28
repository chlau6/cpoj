#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> numberOfLines(vector<int>& widths, string s) {
        int lines = 1;
        int width = 0;

        for (auto c : s) {
            int digitWidth = widths[c - 'a'];

            if (width + digitWidth > 100) {
                width = digitWidth;
                lines++;
            } else {
                width += digitWidth;
            }
        }

        return {lines, width};
    }
};