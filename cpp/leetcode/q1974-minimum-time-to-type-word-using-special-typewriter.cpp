#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minTimeToType(string word) {
        int result = word.size();
        char pointer = 'a';

        for (char c : word) {
            int diff = abs(c - pointer);
            result += min(diff, 26 - diff);
            pointer = c;
        }

        return result;
    }
};