#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        random_shuffle(nums.begin(), nums.end());

        int n = nums.size();
        int i = 0;
        int j = n - 1;

        while (true) {
            int pos = partition(nums, i, j);

            if (pos == k - 1) {
                return nums[k - 1];
            } else if (pos > k - 1) {
                j = pos - 1;
            } else {
                i = pos + 1;
            }
        }
    }

    int partition(vector<int>& nums, int left, int right) {
        int pivot = nums[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            if (nums[i] < pivot && nums[j] > pivot) {
                swap(nums[i++], nums[j--]);
            }

            if (nums[i] >= pivot) i++;
            if (nums[j] <= pivot) j--;
        }

        swap(nums[left], nums[j]);

        return j;
    }
};