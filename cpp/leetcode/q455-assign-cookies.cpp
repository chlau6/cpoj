#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());

        int i = 0;
        int j = 0;
        int sLength = s.size();
        int gLength = g.size();

        while (i < sLength && j < gLength) {
            if (s[i] >= g[j]) {
                j++;
            }
            i++;
        }

        return j;
    }
};