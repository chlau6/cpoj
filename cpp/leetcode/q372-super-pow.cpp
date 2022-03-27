#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int superPow(int a, vector<int>& b) {
        int result = 1;
        int n = b.size();

        for (int i = 0; i < n; i++) {
            result = pow(result * 10) * pow(a, b[i]) % 1337;
        }
    }

    int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x % 1337;

        return pow(x % 1337, n / 2) * pow(x % 1337, n - n / 2) % 1337;
    }
};