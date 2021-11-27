#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minimumMoves(string s) {
        int i = 0;
        int n = s.size();
        int result = 0;

        while (i < n) {
            if (s[i] == 'O') {
                i++;
            } else {
                i += 3;
                result++;
            }
        }

        return result;
    }
};