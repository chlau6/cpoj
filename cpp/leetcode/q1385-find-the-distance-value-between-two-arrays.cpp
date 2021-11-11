#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        int result = 0;

        sort(arr2.begin(), arr2.end());

        for (int num : arr1) {
            if (isBetweenRange(arr2, num - d, num + d)) result++;
        }

        return result;
    }

    bool isBetweenRange(vector<int>& nums, int from, int to) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= from && nums[mid] <= to) {
                return false;
            } else if (nums[mid] < from) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
};