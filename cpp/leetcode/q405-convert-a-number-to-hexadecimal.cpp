#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string toHex(int num) {
        string result = "";

        for (int i = 0; num != 0 && i < 8; i++) {
            int digit = num & 0xf;

            if (digit >= 10) {
                result = (char) (87 + digit) + result;
            } else {
                result = to_string(digit) + result;
            }

            num >>= 4;
        }

        return result.empty() ? "0" : result;
    }
};