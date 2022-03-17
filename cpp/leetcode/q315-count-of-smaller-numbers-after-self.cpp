#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> countSmaller(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);
        vector<int> index(n);

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergesort(result, index, nums, 0, n - 1);

        return result;
    }

    void mergesort(vector<int>& result, vector<int>& index, vector<int>& nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergesort(result, index, nums, left, mid);
        mergesort(result, index, nums, mid + 1, right);
        merge(result, index, nums, left, mid, mid + 1, right);
    }

    void merge(vector<int>& result, vector<int>& index, vector<int>& nums, int l1, int l2, int r1, int r2) {
        int start = l1;
        vector<int> temp(r2 - l1 + 1);
        int count = 0;
        int k = 0;

        while (l1 <= l2 || r1 <= r2) {
            if (l1 > l2) {
                temp[k++] = index[r1++];
            } else if (r1 > r2) {
                result[index[l1]] += count;
                temp[k++] = index[l1++];
            } else if (nums[index[l1]] > nums[index[r1]]) {
                count++;
                temp[k++] = index[r1++];
            } else {
                result[index[l1]] += count;
                temp[k++] = index[l1++];
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            index[start + i] = temp[i];
        }
    }
};