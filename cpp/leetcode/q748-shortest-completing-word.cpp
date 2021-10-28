#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string shortestCompletingWord(string licensePlate, vector<string>& words) {
        vector<int> counts(26);
        int totalChar = 0;
        string result = "";

        for (auto c : licensePlate) {
            if (isalpha(c)) {
                counts[tolower(c) - 'a']++;
                totalChar++;
            }
        }

        for (auto word : words) {
            int count = totalChar;
            vector<int> countCopy(counts);

            for (auto c : word) {
                if (--countCopy[c - 'a'] >= 0) count--;
            }

            if (count == 0 && (result.empty() || word.size() < result.size())) {
                result = word;
            }
        }

        return result;
    }
};