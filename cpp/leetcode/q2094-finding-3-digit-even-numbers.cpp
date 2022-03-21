#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {
        vector<int> result;

        vector<int> count(10);
        for (int digit : digits) {
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; count[i] > 0 && j < 10; j++) {
                int m = (i == j) ? 1 : 0;

                for (int k = 0; count[j] > m && k < 10; k += 2) {
                    int n = (i == k ? 1 : 0) + (j == k ? 1 : 0);

                    if (count[k] > n) {
                        result.push_back(i * 100 + j * 10 + k);
                    }
                }
            }
        }

        return result;
    }
};