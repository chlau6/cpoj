#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findComplement(int num) {
        int result = 0;
        int shift = 0;

        while (num != 0) {
            result = (((num & 1) ^ 1) << shift) + result;
            shift++;
            num >>= 1;
        }

        return result;
    }
};