#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> wordBreak(string s, vector<string>& wordDict) {
        unordered_map<string, vector<string>> map;

        return dfs(map, wordDict, s);
    }

    vector<string> dfs(unordered_map<string, vector<string>>& map, vector<string>& wordDict, string s) {
        if (map.count(s)) return map[s];
        if (s == "") return {""};

        vector<string> result;

        for (auto word : wordDict) {
            int n = word.size();

            if (s.substr(0, n) != word) continue;

            vector<string> subList = dfs(map, wordDict, s.substr(n));

            for (auto sub : subList) {
                result.push_back(word + (sub.empty() ? "" : " ") + sub);
            }
        }

        return map[s] = result;
    }
};