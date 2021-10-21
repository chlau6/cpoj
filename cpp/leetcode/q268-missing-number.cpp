#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int num = 0;
        int length = nums.size();
        int i;

        for (i = 0; i < length; i++) {
            num = num ^ i ^ nums[i];
        }

        return num ^ i;
    }
};