#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> s1(nums1.begin(), nums1.end());
        unordered_set<int> s2;

        for (int num : nums2) {
            if (s1.count(num)) {
                s2.insert(num);
            }
        }

        return vector<int>(s2.begin(), s2.end());
    }
};