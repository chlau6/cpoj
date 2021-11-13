#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isPathCrossing(string path) {
        unordered_set<int> set;
        set.insert(0);

        int x = 0;
        int y = 0;

        for (auto c : path) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }

            if (!set.emplace(x * 10001 + y).second) return true;
        }

        return false;
    }
};