#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    char findTheDifference(string s, string t) {
        int letter = 0;
        int length = s.size();

        for (int i = 0; i < length; i++) {
            letter = letter ^ s[i] ^ t[i];
        }

        return (char) (letter ^ t[length]);
    }
};