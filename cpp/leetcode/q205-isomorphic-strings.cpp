#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int a[256] = {0};
        int b[256] = {0};
        int length = s.size();

        for (int i = 0; i < length; i++) {
            if (a[s[i]] != b[t[i]]) return false;

            a[s[i]] = b[t[i]] = i + 1;
        }

        return true;
    }
};