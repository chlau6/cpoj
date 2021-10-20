#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        vector<int> leftSubarray(leftSize);
        vector<int> rightSubarray(rightSize);

        for (int i = 0; i < leftSize; i++) {
            leftSubarray[i] = nums[start + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightSubarray[i] = nums[mid + 1 + i];
        }
w
        int i = 0, j = 0, k = start;

        while (i < leftSize && j < rightSize) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                nums[k++] = leftSubarray[i++];
            } else {
                nums[k++] = rightSubarray[j++];
            }
        }

        while (i < leftSize) {
            nums[k++] = leftSubarray[i++];
        }

        while (j < rightSize) {
            nums[k++] = rightSubarray[j++];
        }
    }

    void mergeSort(vector<int>& nums, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }
};

int main() {
    vector<int> nums = {38, 27, 43, 3, 9, 82, 10};

    Solution s;
    s.mergeSort(nums, 0, nums.size() - 1);

    for (int i = 0; i < nums.size(); i++) {
        cout << nums[i] << " ";
    }
}