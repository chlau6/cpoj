#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        int n = nums.size();
        set<long> set;

        for (int i = 0; i < n; i++) {
            long lowerBound = (long) nums[i] - t;
            auto num = set.lower_bound(lowerBound);

            if (num != set.end() && abs(*num - nums[i]) <= t) {
                return true;
            }

            set.insert(nums[i]);

            if (i >= k) {
                set.erase(nums[i - k]);
            }
        }

        return false;
    }
};