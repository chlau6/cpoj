#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numDifferentIntegers(string word) {
        unordered_set<string> set;
        int i = 0;
        int n = word.size();

        while (i < n) {
            while (i < n && isalpha(word[i])) i++;

            int start = i;
            while (i < n && isdigit(word[i])) i++;

            if (i - start > 0) {
                while (i - start > 1 && word[start] == '0') start++;
                set.insert(word.substr(start, i - start));
            }
        }

        return set.size();
    }
};