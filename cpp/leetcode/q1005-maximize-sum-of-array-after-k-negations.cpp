#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());

        int length = nums.size();

        for (int i = 0; i < length && k > 0 && nums[i] < 0; i++, k--) {
            nums[i] = -nums[i];
        }

        int min = *min_element(nums.begin(), nums.end());
        int sum = accumulate(nums.begin(), nums.end(), 0);

        return sum - (k % 2) * 2 * min;
    }
};