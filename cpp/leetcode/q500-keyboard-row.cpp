#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        vector<int> map {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

        vector<string> result;

        for (auto& word : words) {
            int row = map[tolower(word[0]) - 'a'];
            int length = word.size();
            int i = 0;

            for (i = 1; i < length; i++) {
                if (map[tolower(word[i]) - 'a'] != row) {
                    break;
                }
            }

            if (i == length) {
                result.push_back(word);
            }
        }

        return result;
    }
};