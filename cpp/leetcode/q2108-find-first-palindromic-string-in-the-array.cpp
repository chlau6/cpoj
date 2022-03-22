#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (auto& word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    bool isPalindrome(string word) {
        int i = 0;
        int j = word.size() - 1;

        while (i < j) {
            if (word[i++] != word[j--]) {
                return false;
            }
        }

        return true;
    }
};