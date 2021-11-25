#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> counts(26);
        int k = words.size();

        for (string word : words) {
            for (char c : word) {
                counts[c - 'a']++;
            }
        }

        for (int count : counts) {
            if (count % k != 0) return false;
        }

        return true;
    }
};