#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> counts(101);
        int length = nums.size();

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 1; i < 101; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                nums[i] = counts[nums[i] - 1];
            }
        }

        return nums;
    }
};