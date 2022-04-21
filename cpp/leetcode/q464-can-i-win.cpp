#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canIWin(int maxChoosableInteger, int desiredTotal) {
        if (maxChoosableInteger >= desiredTotal) return true;
        if (arithmeticSum(maxChoosableInteger) < desiredTotal) return false;

        unordered_map<int, bool> map;
        return canWin(map, maxChoosableInteger, desiredTotal, 0);
    }

    bool canWin(unordered_map<int, bool>& map, int n, int total, int used) {
        if (map.count(used)) return map[used];

        for (int i = 0; i < n; i++) {
            int curr = (1 << i);

            if ((curr & used) != 0) continue;

            if (total <= i + 1 || !canWin(map, n, total - (i + 1), curr | used)) {
                map[used] = true;
                return true;
            }
        }

        map[used] = false;
        return false;
    }

    int arithmeticSum(int x) {
        return (1 + x) * x / 2;
    }
};