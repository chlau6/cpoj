#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        unordered_set<string> set(wordList.begin(), wordList.end());
        if (!set.count(endWord)) return 0;

        int result = 1;
        queue<string> queue;
        queue.push(beginWord);

        while (!queue.empty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                string lastWord = queue.front();
                queue.pop();

                if (lastWord == endWord) return result;
                int m = lastWord.size();

                for (int j = 0; j < m; j++) {
                    string nextWord = lastWord;

                    for (char c = 'a'; c <= 'z'; c++) {
                        nextWord[j] = c;

                        if (set.count(nextWord)) {
                            queue.push(nextWord);
                            set.erase(nextWord);
                        }
                    }
                }
            }

            result++;
        }

        return 0;
    }
};