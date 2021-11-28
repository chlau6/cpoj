#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        unordered_map<string, int> map;
        int result = 0;

        for (string word : words1) {
            map[word]++;
        }

        for (string word : words2) {
            if (map[word] < 2) {
                --map[word];
            }
        }

        for (auto it : map) {
            if (it.second == 0) {
                result++;
            }
        }

        return result;
    }
};