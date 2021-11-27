#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countKDifference(vector<int>& nums, int k) {
        vector<int> counts(101);
        int result = 0;

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = k; i < 101; i++) {
            result += counts[i] * counts[i - k];
        }

        return result;
    }
};