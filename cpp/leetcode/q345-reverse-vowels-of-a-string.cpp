#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reverseVowels(string s) {
        int i = 0;
        int j = s.size();

        while (i < j) {
            if (!isVowel(s[i])) {
                i++;
            } else if (!isVowel(s[j])) {
                j--;
            } else {
                swap(s[i++], s[j--]);
            }
        }

        return s;
    }

    bool isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
};