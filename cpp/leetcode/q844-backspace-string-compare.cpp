#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool backspaceCompare(string s, string t) {
        int i = s.size() - 1;
        int j = t.size() - 1;
        int count1 = 0;
        int count2 = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (s[i] == '#' || count1 > 0)) {
                count1 += s[i--] == '#' ? 1 : -1;
            }

            while (j >= 0 && (t[j] == '#' || count2 > 0)) {
                count2 += t[j--] == '#' ? 1 : -1;
            }

            if (i < 0 || j < 0) return i == j;
            if (s[i--] != t[j--]) return false;
        }

        return i == j;
    }
};