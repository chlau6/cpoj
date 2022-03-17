#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int nthSuperUglyNumber(int n, vector<int>& primes) {
        int size = primes.size();
        int nums[n];
        int index[size];
        memset(nums, 0, sizeof(nums));
        memset(index, 0, sizeof(index));
        nums[0] = 1;

        for (int i = 1; i < n; i++) {
            nums[i] = INT_MAX;

            for (int j = 0; j < size; j++) {
                nums[i] = min(nums[i], primes[j] * nums[index[j]]);
            }

            for (int j = 0; j < size; j++) {
                if (primes[j] * nums[index[j]] == nums[i]) {
                    index[j]++;
                }
            }
        }

        return nums[n - 1];
    }
};