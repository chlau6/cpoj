#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string freqAlphabets(string s) {
        string result;

        int length = s.size();
        int i = 0;

        while (i < length) {
            if (i + 2 < length && s[i + 2] == '#') {
                result += 'j' + (s[i] - '1') * 10 + s[i + 1] - '0';
                i += 3;
            } else {
                result += 'a' + s[i] - '1';
                i++;
            }
        }

        return result;
    }
};