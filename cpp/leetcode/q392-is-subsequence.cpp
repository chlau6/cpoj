#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i = 0;
        int sLength = s.size();
        int tLength = t.size();

        for (int j = 0; i < sLength && j < tLength; j++) {
            if (s[i] == t[j]) i++;
        }

        return i == sLength;
    }
};