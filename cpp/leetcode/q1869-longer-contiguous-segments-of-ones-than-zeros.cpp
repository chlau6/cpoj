#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkZeroOnes(string s) {
        int maxOnes = 0;
        int maxZeros = 0;
        int currOnes = 0;
        int currZeros = 0;

        for (char c : s) {
            if (c == '0') {
                maxZeros = max(maxZeros, ++currZeros);
                currOnes = 0;
            } else {
                currZeros = 0;
                maxOnes = max(maxOnes, ++currOnes);
            }
        }

        return maxOnes > maxZeros;
    }
};