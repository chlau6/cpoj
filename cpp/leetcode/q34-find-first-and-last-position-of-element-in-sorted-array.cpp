#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size() - 1;
        vector<int> result(2, -1);

        if (nums.size() == 0 || nums[0] > target || nums[n] < target) {
            return result;
        }

        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[left] != target) {
            return result;
        }

        result[0] = left;
        right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        result[1] = right;

        return result;
    }
};