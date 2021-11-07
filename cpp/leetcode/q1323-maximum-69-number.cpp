#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximum69Number (int num) {
        int maxPos = 0;
        int pos = 1;

        int n = num;

        while (n > 0) {
            if (n % 10 == 6) {
                maxPos = pos;
            }

            n /= 10;
            pos *= 10;
        }

        return num + 3 * maxPos;
    }
};