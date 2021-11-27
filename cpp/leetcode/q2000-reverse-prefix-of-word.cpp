#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reversePrefix(string word, char ch) {
        int n = word.length();
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (word[i] == ch) {
                pos = i;
                break;
            }
        }

        int i = 0;
        int j = pos;

        while (i < j) {
            swap(word[i++], word[j--]);
        }

        return word;
    }
};