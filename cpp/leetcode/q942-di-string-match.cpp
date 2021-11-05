#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> diStringMatch(string s) {
        vector<int> result;
        int minValue = 0;
        int maxValue = s.size();

        for (char c : s) {
            result.push_back(c == 'I' ? minValue++ : maxValue--);
        }

        result.push_back(maxValue);

        return result;
    }
};