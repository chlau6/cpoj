#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        int l = s.size();
        int m = words.size();
        int n = words[0].size();
        int windows = l - m * n;

        unordered_map<string, int> wordMap;
        vector<int> result;

        for (auto& word : words) {
            wordMap[word]++;
        }

        for (int i = 0; i <= windows; i++) {
            unordered_map<string, int> countMap;
            int j;

            for (j = 0; j < m; j++) {
                int start = i + j * n;

                string w = s.substr(start, n);

                if (!wordMap.count(w)) break;

                countMap[w]++;

                if (countMap[w] > wordMap[w]) break;
            }

            if (j == m) {
                result.push_back(i);
            }
        }

        return result;
    }
};