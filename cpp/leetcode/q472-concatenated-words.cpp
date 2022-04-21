#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findAllConcatenatedWordsInADict(vector<string>& words) {
        vector<string> result;
        unordered_set<string> set(words.begin(), words.end());

        for (string word : words) {
            int n = word.size();
            if (n == 0) continue;

            vector<bool> dp(n + 1);
            dp[0] = true;

            for (int i = 0; i < n; i++) {
                if (!dp[i]) continue;

                for (int j = i + 1; j <= n; j++) {
                    if (j - i < n && set.count(word.substr(i, j - i))) {
                        dp[j] = true;
                    }
                }

                if (dp[n]) {
                    result.push_back(word);
                    break;
                }
            }
        }

        return result;
    }
};