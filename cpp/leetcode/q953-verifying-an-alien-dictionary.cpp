#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isAlienSorted(vector<string>& words, string order) {
        vector<int> orders(26);
        int length = words.size();

        for (int i = 0; i < 26; i++) {
            orders[order[i] - 'a'] = i;
        }

        for (auto& word : words) {
            for (auto& c : word) {
                c = orders[c - 'a'];
            }
        }

        return is_sorted(words.begin(), words.end());
    }
};