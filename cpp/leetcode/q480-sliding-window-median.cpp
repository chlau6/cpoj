#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<double> medianSlidingWindow(vector<int>& nums, int k) {
        multiset<int> multiSet(nums.begin(), nums.begin() + k);
        vector<double> result;

        auto mid = next(multiSet.begin(), k / 2);
        int n = nums.size();
        int i = k;

        while (true) {
            result.push_back(((double) (*mid) + *prev(mid, 1 - k % 2)) / 2);

            if (i == n) return result;

            multiSet.insert(nums[i]);

            if (nums[i] < *mid) {
                mid--;
            }

            if (nums[i - k] <= *mid) {
                mid++;
            }

            multiSet.erase(multiSet.lower_bound(nums[i - k]));

            i++;
        }
    }
};