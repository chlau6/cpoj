#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countPoints(string rings) {
        int n = rings.size();
        vector<int> count(10);
        int result = 0;

        for (int i = 0; i < n; i += 2) {
            int color = 0;
            int pos = rings[i + 1] - '0';

            if (rings[i] == 'R') {
                color = 1;
            } else if (rings[i] == 'G') {
                color = 2;
            } else {
                color = 4;
            }

            count[pos] |= color;
        }

        for (int c : count) {
            if (c == 7) result++;
        }

        return result;
    }
};