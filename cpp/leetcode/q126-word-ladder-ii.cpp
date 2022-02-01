#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<string>> findLadders(string beginWord, string endWord, vector<string>& wordList) {
        vector<vector<string>> result;
        queue<vector<string>> queue;
        unordered_set<string> set(wordList.begin(), wordList.end());
        unordered_set<string> words;

        queue.push({beginWord});

        int level = 1;
        int minLevel = INT_MAX;

        while (!queue.empty()) {
            auto path = queue.front();
            queue.pop();

            if (path.size() > level) {
                for (string w : words) {
                    set.erase(w);
                }

                words.clear();
                level = path.size();

                if (level > minLevel) break;
            }

            string lastWord = path.back();
            int n = lastWord.size();
            for (int i = 0; i < n; i++) {
                string nextWord = lastWord;
                for (char c = 'a'; c <= 'z'; c++) {
                    nextWord[i] = c;

                    if (!set.count(nextWord)) continue;
                    words.insert(nextWord);

                    vector<string> newPath = path;
                    newPath.push_back(nextWord);

                    if (nextWord == endWord) {
                        result.push_back(newPath);
                        minLevel = newPath.size();
                    } else {
                        queue.push(newPath);
                    }
                }
            }
        }

        return result;
    }
};