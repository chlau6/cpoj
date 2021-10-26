#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int hammingDistance(int x, int y) {
        int distance = 0;
        int xorResult = x ^ y;

        while (xorResult > 0) {
            if ((xorResult & 1) == 1) {
                distance++;
            }

            xorResult >>= 1;
        }

        return distance;
    }
};