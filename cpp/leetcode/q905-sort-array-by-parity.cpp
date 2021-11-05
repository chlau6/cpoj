#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int j = 0;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums[i], nums[j++]);
            }
        }

        return nums;
    }
};