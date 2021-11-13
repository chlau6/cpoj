#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        sentence = " " + sentence;
        searchWord = " " + searchWord;
        int result = 0;

        int pos = sentence.find(searchWord);

        if (pos == string::npos) return -1;

        for (int i = 0; i < pos; i++) {
            if (sentence[i] == ' ') result++;
        }

        return result + 1;
    }
};