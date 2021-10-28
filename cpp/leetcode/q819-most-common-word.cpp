#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {
        unordered_set<string> set(banned.begin(), banned.end());
        unordered_map<string, int> map;

        for (auto& c : paragraph) {
            c = isalpha(c) ? tolower(c) : ' ';
        }

        istringstream iss(paragraph);

        string token = "";
        string result = "";
        int max = 0;

        while (iss >> token) {
            if (!set.count(token) && ++map[token] > max) {
                result = token;
                max = map[token];
            }
        }

        return result;
    }
};