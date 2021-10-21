#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        int windows = haystack.size() - needle.size() + 1;

        for (int i = 0; i < windows; i++) {
            int j;

            for (j = 0; j < needle.size(); j++) {
                if (haystack[i + j] != needle[j]) break;
            }

            if (j == needle.size()) return i;
        }

        return -1;
    }
};