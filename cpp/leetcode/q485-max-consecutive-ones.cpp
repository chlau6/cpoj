#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int localMax = 0;
        int globalMax = 0;

        for (int num : nums) {
            if (num == 1) {
                globalMax = max(++localMax, globalMax);
            } else {
                localMax = 0;
            }
        }

        return globalMax;
    }
};