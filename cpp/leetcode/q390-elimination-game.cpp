#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lastRemaining(int n) {
        return leftToRight(n);
    }

    int leftToRight(int n) {
        if (n <= 2) return n;

        return 2 * rightToLeft(n / 2);
    }

    int rightToLeft(int n) {
        if (n <= 2) return 1;

        if (n % 2 == 1) return 2 * leftToRight(n / 2);

        return 2 * leftToRight(n / 2) - 1;
    }
};