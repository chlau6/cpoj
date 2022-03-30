#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countElements(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        int n = nums.size();
        int min = nums[0];
        int max = nums[n - 1];
        int result = 0;

        for (int num : nums) {
            if (min < num && num < max) {
                result++;
            }
        }

        return result;
    }
};