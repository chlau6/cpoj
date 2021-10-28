#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        int i = 0;
        int length = bits.size();

        while (i < length - 1) {
            if (bits[i++] == 1) {
                i++;
            }
        }

        return i == length - 1;
    }
};