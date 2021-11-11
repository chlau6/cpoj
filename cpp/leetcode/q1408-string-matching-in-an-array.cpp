#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        vector<string> result;
        string combined;
        int length = words.size();

        for (int i = 0; i < length; i++) {
            if (i > 0) combined += ' ';
            combined += words[i];
        }

        for (string word : words) {
            if (combined.find(word) != combined.rfind(word)) {
                result.push_back(word);
            }
        }

        return result;
    }
};