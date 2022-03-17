#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> maxNumber(vector<int>& nums1, vector<int>& nums2, int k) {
        int m = nums1.size();
        int n = nums2.size();
        int start = max(0, k - n);
        int end = min(k, m);
        vector<int> result;

        for (int i = start; i <= end; i++) {
            result = max(result, mergeVector(findVector(nums1, i), findVector(nums2, k - i)));
        }

        return result;
    }

    vector<int> findVector(vector<int>& nums, int k) {
        vector<int> result;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            while (result.size() + n - i > k && !result.empty() && result.back() < nums[i]) {
                result.pop_back();
            }

            if (result.size() < k) {
                result.push_back(nums[i]);
            }
        }

        return result;
    }

    vector<int> mergeVector(vector<int> a1, vector<int> a2) {
        vector<int> result;

        while (!a1.empty() || !a2.empty()) {
            vector<int>& temp = (a1 > a2) ? a1 : a2;
            result.push_back(temp[0]);
            temp.erase(temp.begin());
        }

        return result;
    }
};