#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string getHint(string secret, string guess) {
        vector<int> count(10);
        int n = secret.size();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            int a = secret[i] - '0';
            int b = guess[i] - '0';

            if (b == a) {
                x++;
                continue;
            }

            if (count[a] < 0) y++;
            if (count[b] > 0) y++;

            count[a]++;
            count[b]--;
        }

        return to_string(x) + "A" + to_string(y) + "B";
    }
};