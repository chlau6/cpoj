#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> getNoZeroIntegers(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (isNoZero(i) && isNoZero(n - i)) {
                return {i, n - i};
            }
        }

        return {-1, -1};
    }

    bool isNoZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }

        return true;
    }
};