#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_set<int> s;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            if (s.count(nums[i])) return true;

            s.insert(nums[i]);

            if (i >= k) s.erase(nums[i - k]);
        }

        return false;
    }
};