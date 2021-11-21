#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        vector<int> index;
        int n = s1.size();

        for (int i = 0; i < n; i++) {
            if (s1[i] != s2[i]) {
                index.push_back(i);
            }
        }

        return index.size() == 0 || index.size() == 2 && s1[index[0]] == s2[index[1]] && s1[index[1]] == s2[index[0]];
    }
};