#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int binarySearch(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
};

int main() {
    vector<int> nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

    Solution s;
    cout << s.binarySearch(nums, 8) << "\n";
    cout << s.binarySearch(nums, 2) << "\n";
}