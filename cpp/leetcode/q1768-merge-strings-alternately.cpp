#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int i = 0;
        int j = 0;
        int n1 = word1.size();
        int n2 = word2.size();
        string result;

        while (i < n1 && j < n2) {
            result += word1[i++];
            result += word2[j++];
        }

        if (i < n1) result += word1.substr(i);
        else if (j < n2) result += word2.substr(j);

        return result;
    }
};