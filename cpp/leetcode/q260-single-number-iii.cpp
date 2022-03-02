#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        unsigned int mask = 0;

        for (int num : nums) {
            mask ^= num;
        }

        mask &= -mask;

        vector<int> result {0, 0};

        for (int num : nums) {
            if ((num & mask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }
};