#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool hasAlternatingBits(int n) {
        int lastBit = n & 1;
        n >>= 1;

        while (n > 0) {
            int currentBit = n & 1;

            if (lastBit == currentBit) return false;

            lastBit = currentBit;
            n >>= 1;
        }

        return true;
    }
};