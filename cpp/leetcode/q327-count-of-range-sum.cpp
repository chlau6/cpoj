#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countRangeSum(vector<int>& nums, int lower, int upper) {
        int n = nums.size();
        vector<long> sums(n + 1);
        vector<long> temp(n + 1);
        int result = 0;

        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }

        mergesort(sums, temp, 0, n, lower, upper, result);

        return result;
    }

    void mergesort(vector<long>& sums, vector<long>& temp, int start, int end, int lower, int upper, int& result) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergesort(sums, temp, start, mid, lower, upper, result);
        mergesort(sums, temp, mid + 1, end, lower, upper, result);
        merge(sums, temp, start, mid, end, lower, upper, result);
    }

    void merge(vector<long>& sums, vector<long>& temp, int start, int mid, int end, int lower, int upper, int& result) {
        for (int k = start; k <= end; k++) {
            temp[k] = sums[k];
        }

        int left = mid + 1;
        int right = mid + 1;

        for (int k = start; k <= mid; k++) {
            while (left <= end && temp[left] - temp[k] < lower) {
                left++;
            }

            while (right <= end && temp[right] - temp[k] <= upper) {
                right++;
            }

            result += right - left;
        }

        int i = start;
        int j = mid + 1;

        for (int k = start; k <= end; k++) {
            if (j > end || (i <= end && temp[i] <= temp[j])) {
                sums[k] = temp[i++];
            } else {
                sums[k] = temp[j++];
            }
        }
    }
};