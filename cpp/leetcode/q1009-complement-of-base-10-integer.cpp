#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int bitwiseComplement(int n) {
        int ones = 1;

        while (n > ones) {
            ones = (ones << 1) + 1;
        }

        return n ^ ones;
    }
};