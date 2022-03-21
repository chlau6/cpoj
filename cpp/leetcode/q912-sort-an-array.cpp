#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();

        mergesort(nums, 0, n - 1);

        return nums;
    }

    void mergesort(vector<int>& nums, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergesort(nums, start, mid);
        mergesort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    void merge(vector<int>& nums, int start, int mid, int end) {
        int n = end - start + 1;
        vector<int> temp(n);

        int i = start;
        int j = mid + 1;

        for (int k = 0; k < n; k++) {
            if (j > end || (i <= mid && nums[i] < nums[j])) {
                temp[k] = nums[i++];
            } else {
                temp[k] = nums[j++];
            }
        }

        for (int k = 0; k < n; k++) {
            nums[k + start] = temp[k];
        }
    }
};