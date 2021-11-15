#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        vector<int> pos(26);
        int n = s.size();
        int result = -1;

        for (int i = 0; i < n; i++) {
            int j = s[i] - 'a';

            if (pos[j] == 0) {
                pos[j] = i + 1;
            } else {
                result = max(result, i - pos[j]);
            }
        }

        return result;
    }
};