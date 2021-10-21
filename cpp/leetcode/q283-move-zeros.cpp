#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j = 0;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j++] = temp;
        }
    }
};