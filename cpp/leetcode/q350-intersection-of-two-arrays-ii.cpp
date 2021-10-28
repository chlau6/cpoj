#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        vector<int> counts(1001);

        for (int num : nums1) {
            counts[num]++;
        }

        for (int num : nums2) {
            if (--counts[num] >= 0) ans.push_back(num);
        }

        return ans;
    }
};