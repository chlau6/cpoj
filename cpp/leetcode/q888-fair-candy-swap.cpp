#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> fairCandySwap(vector<int>& aliceSizes, vector<int>& bobSizes) {
        unordered_set<int> bobSet(bobSizes.begin(), bobSizes.end());
        int aliceSum = accumulate(aliceSizes.begin(), aliceSizes.end(), 0);
        int bobSum = accumulate(bobSizes.begin(), bobSizes.end(), 0);

        int diff = (bobSum - aliceSum) / 2;

        for (int num : aliceSizes) {
            if (bobSet.count(num + diff)) {
                return {num, num + diff};
            }
        }

        return {-1, -1};
    }
};