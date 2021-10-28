#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int length = nums.size();
        vector<int> result;

        for (int i = 0; i < length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums[i], nums[nums[i] - 1]);
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] != i + 1) return {nums[i], i + 1};
        }

        return {-1, -1};
    }
};