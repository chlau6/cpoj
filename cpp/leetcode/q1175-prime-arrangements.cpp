#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numPrimeArrangements(int n) {
        vector<bool> primes(n + 1, true);
        primes[0] = primes[1] = false;

        int loop = sqrt(n);

        for (int i = 2; i <= loop; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (primes[i]) count++;
        }

        return (int) (factorial(count) * factorial(n - count) % 1000000007);
    }

    long factorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i % 1000000007;
        }

        return result;
    }
};