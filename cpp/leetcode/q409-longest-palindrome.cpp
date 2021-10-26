#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> counts(256);
        int oddCount = 0;

        for (auto& c : s) {
            if (counts[c] % 2 == 0) {
                counts[c]++;
            } else {
                counts[c]--;
            }
        }

        for (int count : counts) {
            if (count == 1) oddCount++;
        }

        return oddCount <= 1 ? s.size() : s.size() - oddCount + 1;
    }
};