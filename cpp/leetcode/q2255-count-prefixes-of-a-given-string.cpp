#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countPrefixes(vector<string>& words, string s) {
        int result = 0;

        for (auto word : words) {
            if (s.find(word) == 0) {
                result++;
            }
        }

        return result;
    }
};