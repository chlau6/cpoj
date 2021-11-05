#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxNumberOfBalloons(string text) {
        vector<int> counts(26);

        for (char c : text) {
            counts[c - 'a']++;
        }

        int result = counts[1];
        result = min(result, counts[0]);
        result = min(result, counts[11] / 2);
        result = min(result, counts[14] / 2);
        result = min(result, counts[13]);

        return result;
    }
};