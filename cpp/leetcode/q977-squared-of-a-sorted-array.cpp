#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();
        vector<int> result(size);

        int i = 0;
        int j = size - 1;

        for (int k = size - 1; k >= 0; k--) {
            if (abs(nums[i]) >= abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
        }

        return result;
    }
};