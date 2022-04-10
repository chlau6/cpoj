#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int splitArray(vector<int>& nums, int m) {
        int left = 0;
        int right = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            left = max(left, nums[i]);
            right += nums[i];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    bool canSplit(vector<int>& nums, int sum, int m) {
        int count = 1;
        int currSum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            currSum += nums[i];

            if (currSum > sum) {
                currSum = nums[i];
                count++;

                if (count > m) return false;
            }
        }

        return true;
    }
};