#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countPrimeSetBits(int left, int right) {
        vector<bool> isPrime(33);
        isPrime[2] = isPrime[3] = isPrime[5] = isPrime[7] = isPrime[11] = isPrime[13] = isPrime[17] = isPrime[19] = isPrime[23] = isPrime[29] = isPrime[31] = true;

        int result = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;
            int num = i;

            while (num > 0) {
                count += (num & 1);
                num >>= 1;
            }

            if (isPrime[count]) result++;
        }

        return result;
    }
};