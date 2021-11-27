#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int canBeTypedWords(string text, string brokenLetters) {
        vector<bool> broken(26);

        for (char c : brokenLetters) {
            broken[c - 'a'] = true;
        }

        int result = 0;
        int count = 1;

        for (char c : text) {
            if (c == ' ') {
                result += count;
                count = 1;
            } else if (broken[c - 'a']) {
                count = 0;
            }
        }

        return result + count;
    }
};