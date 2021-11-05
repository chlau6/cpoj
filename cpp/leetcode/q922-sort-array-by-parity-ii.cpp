#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int i = 0;
        int j = 1;
        int length = nums.size();

        while (i < length && j < length) {
            if (nums[i] % 2 == 0) {
                i += 2;
            } else if (nums[j] % 2 == 1) {
                j += 2;
            } else {
                swap(nums[i], nums[j]);
            }
        }

        return nums;
    }
};