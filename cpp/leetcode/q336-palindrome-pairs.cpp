#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> palindromePairs(vector<string>& words) {
        vector<vector<int>> result;
        unordered_map<string, int> map;
        set<int> set;
        int n = words.size();

        for (int i = 0; i < n; i++) {
            map[words[i]] = i;
            set.insert(words[i].size());
        }

        for (int i = 0; i < n; i++) {
            string s = words[i];
            int len = s.size();

            reverse(s.begin(), s.end());

            if (map.count(s)) {
                int index = map[s];

                if (index != i) {
                    result.push_back({i, index});
                }
            }

            for (auto it = set.begin(); it != set.end(); it++) {
                int l = *it;

                if (l == len) break;

                if (isPalindrome(s, 0, len - l - 1)) {
                    string required = s.substr(len - l);

                    if (map.count(required)) {
                        result.push_back({i, map[required]});
                    }
                }

                if (isPalindrome(s, l, len - 1)) {
                    string required = s.substr(0, l);

                    if (map.count(required)) {
                        result.push_back({map[required], i});
                    }
                }
            }
        }

        return result;
    }

    bool isPalindrome(string s, int i, int j) {
        while (i < j) {
            if (s[i++] != s[j--]) return false;
        }

        return true;
    }
};