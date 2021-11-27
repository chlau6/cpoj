#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isThree(int n) {
        int root = sqrt(n);
        int d = 2;
        int i = 2;

        while (i <= root && d < 3) {
            if (n % i == 0) {
                d += n / i == i ? 1 : 2;
            }
            i++;
        }

        return d == 3;
    }
};