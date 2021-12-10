#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1) return s;

        int n = s.size();
        int gap = 2 * numRows - 2;
        string result = "";

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += gap) {
                result += s[j];

                int k = j + gap - 2 * i;

                if (i != 0 && i != numRows - 1 && k < n) {
                    result += s[k];
                }
            }
        }

        return result;
    }
};