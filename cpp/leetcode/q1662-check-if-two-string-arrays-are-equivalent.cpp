#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        int a1 = 0;
        int a2 = 0;
        int c1 = 0;
        int c2 = 0;
        int n1 = word1.size();
        int n2 = word2.size();

        while (a1 < n1 && a2 < n2) {
            if (word1[a1][c1] != word2[a2][c2]) return false;

            if (c1 == word1[a1].size() - 1) {
                a1++;
                c1 = 0;
            } else {
                c1++;
            }

            if (c2 == word2[a2].size() - 1) {
                a2++;
                c2 = 0;
            } else {
                c2++;
            }
        }

        return a1 == n1 && a2 == n2;
    }
};