#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<int> count(26, INT_MAX);

        for (auto word : words) {
            vector<int> a(26);

            for (auto c : word) {
                a[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                count[i] = min(count[i], a[i]);
            }
        }

        vector<string> result;

        for (char i = 'a'; i <= 'z'; i++) {
            while (--count[i - 'a'] >= 0) {
                result.push_back(string(1, i));
            }
        }

        return result;
    }
};