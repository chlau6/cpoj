#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int reverse(int x) {
        int bound = INT_MAX / 10;
        int result = 0;

        while (x != 0) {
            if (abs(result) > bound) return 0;

            result = result * 10 + x % 10;
            x /= 10;
        }

        return result;
    }
};