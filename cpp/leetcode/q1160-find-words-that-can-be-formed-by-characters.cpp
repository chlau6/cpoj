#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        vector<int> counts(26);
        int result = 0;

        for (char c : chars) {
            counts[c - 'a']++;
        }

        for (string word : words) {
            vector<int> a(26);
            int length = word.size();

            copy(counts.begin(), counts.end(), a.begin());

            for (int i = 0; i < length; i++) {
                if (--a[word[i] - 'a'] < 0) {
                    length = 0;
                    break;
                }
            }

            result += length;
        }

        return result;
    }
};