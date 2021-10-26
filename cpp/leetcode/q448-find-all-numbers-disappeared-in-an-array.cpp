#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> result;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            int index = abs(nums[i]) - 1;
            nums[index] = (nums[index] > 0) ? -nums[index] : nums[index];
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                result.push_back(i + 1);
            }
        }

        return result;
    }
};