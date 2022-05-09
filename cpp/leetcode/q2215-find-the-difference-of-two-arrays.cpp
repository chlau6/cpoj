#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        vector<vector<int>> result = {{}, {}};
        unordered_set<int> set1;
        unordered_set<int> set2;

        for (int num : nums1) {
            set1.insert(num);
        }

        for (int num : nums2) {
            set2.insert(num);
        }

        for (int num : set1) {
            if (!set2.count(num)) {
                result[0].push_back(num);
            }
        }

        for (int num : set2) {
            if (!set1.count(num)) {
                result[1].push_back(num);
            }
        }

        return result;
    }
};