#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool detectCapitalUse(string word) {
        int upperCaseCount = 0;
        int length = word.size();

        for (int i = 0; i < length; i++) {
            if (word[i] <= 'Z') {
                upperCaseCount++;
            }
        }

        return upperCaseCount == 0 || upperCaseCount == length || upperCaseCount == 1 && word[0] <= 92;
    }
};