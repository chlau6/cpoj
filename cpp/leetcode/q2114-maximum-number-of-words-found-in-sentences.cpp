#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int result = 0;

        for (auto& sentence : sentences) {
            int words = 1;

            for (auto& c : sentence) {
                if (c == ' ') {
                    words++;
                }
            }

            result = max(result, words);
        }

        return result;
    }
};