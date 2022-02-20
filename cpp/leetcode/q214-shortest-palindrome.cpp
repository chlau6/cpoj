#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string shortestPalindrome(string s) {
        int n = s.size();
        int i = 0;
        int j = n - 1;

        while (j >= 0) {
            if (s[i] == s[j]) {
                i++;
            }
            j--;
        }

        if (i == n) return s;

        string suffix = s.substr(i);
        string prefix = suffix;
        reverse(prefix.begin(), prefix.end());

        return prefix + shortestPalindrome(s.substr(0, i)) + suffix;
    }
};