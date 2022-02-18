#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countPrimes(int n) {
        vector<bool> notPrime(n);
        int result = 0;

        for (int i = 2; i < n; i++) {
            if (notPrime[i]) continue;

            result++;

            for (int j = i; j < n; j += i) {
                notPrime[j] = true;
            }
        }

        return result;
    }
};