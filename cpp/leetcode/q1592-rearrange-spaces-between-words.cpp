#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reorderSpaces(string text) {
        int space = count(text.begin(), text.end(), ' ');
        vector<string> words;
        istringstream iss(text);
        string token;

        while (iss >> token) {
            words.push_back(token);
        }

        int gap = length <= 1 ? 0 : space / (length - 1);
        int trailing = space - gap * (length - 1);
        int length = words.size();
        string result;

        for (int i = 0; i < length; i++) {
            if (i > 0) result += string(gap, ' ');
            result += words[i];
        }

        return result + string(trailing, ' ');
    }
};