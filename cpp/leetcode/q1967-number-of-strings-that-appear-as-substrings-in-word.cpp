#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numOfStrings(vector<string>& patterns, string word) {
        int result = 0;

        for (string pattern : patterns) {
            if (word.find(pattern) != string::npos) result++;
        }

        return result;
    }
};