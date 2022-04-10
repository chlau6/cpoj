#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> counts(256);
        int oddCount = 0;

        for (auto& c : s) {
            counts[c]++;
        }

        for (int count : counts) {
            if (count % 2 == 1) oddCount++;
        }

        return oddCount == 0 ? s.size() : s.size() - oddCount + 1;
    }
};