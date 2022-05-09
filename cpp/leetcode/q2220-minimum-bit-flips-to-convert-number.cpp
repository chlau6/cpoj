#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        int result = 0;

        while (xorResult > 0) {
            if ((xorResult & 1) == 1) {
                result++;
            }

            xorResult >>= 1;
        }

        return result;
    }
};