#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string minWindow(string s, string t) {
        int m = s.size();
        int n = t.size();

        int count = 0;
        int left = 0;
        int minLeft = -1;
        int minLen = INT_MAX;
        vector<int> letters(128);

        for (int i = 0; i < n; i++) {
            letters[t[i]]++;
        }

        for (int i = 0; i < m; i++) {
            if (--letters[s[i]] >= 0) {
                count++;
            }

            while (count == n) {
                if (i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    minLeft = left;
                }

                if (++letters[s[left]] > 0) {
                    count--;
                }

                left++;
            }
        }

        return minLeft == -1 ? "" : s.substr(minLeft, minLen);
    }
};