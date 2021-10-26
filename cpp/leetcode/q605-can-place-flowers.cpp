#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int length = flowerbed.size();

        for (int i = 0; i < length && n > 0; i++) {
            if (flowerbed[i] == 1) continue;

            int prev = (i == 0) ? 0 : flowerbed[i - 1];
            int next = (i == length - 1) ? 0 : flowerbed[i + 1];

            if (prev + next == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
};