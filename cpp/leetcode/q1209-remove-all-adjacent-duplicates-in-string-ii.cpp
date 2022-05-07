#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string removeDuplicates(string s, int k) {
        int n = s.length();
        vector<int> count(n);
        int j = 0;

        for (int i = 0; i < n; i++, j++) {
            s[j] = s[i];

            if (j > 0 && s[j] == s[j - 1]) {
                count[j] = count[j - 1] + 1;
            } else {
                count[j] = 1;
            }

            if (count[j] == k) {
                j -= k;
            }
        }

        return s.substr(0, j);
    }
};