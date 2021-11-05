#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string tictactoe(vector<vector<int>>& moves) {
        vector<int> a(8);
        vector<int> b(8);

        int length = moves.size();

        for (int i = 0; i < length; i++) {
            vector<int>& player = (i % 2 == 0) ? a : b;

            int r = moves[i][0];
            int c = moves[i][1];

            player[r]++;
            player[c + 3]++;

            if (r == c) player[6]++;
            if (r == 2 - c) player[7]++;
        }

        for (int i = 0; i < 8; i++) {
            if (a[i] == 3) return "A";
            else if (b[i] == 3) return "B";
        }

        return length == 9 ? "Draw" : "Pending";
    }
};