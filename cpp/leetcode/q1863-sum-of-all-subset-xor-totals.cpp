#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        int n = nums.size();
        int result = 0;

        for (int num : nums) {
            result |= num;
        }

        return result * (1 << n - 1);
    }
};