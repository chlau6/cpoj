#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        unordered_map<int, int> map;
        int result = 0;

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                map[n1 + n2]++;
            }
        }

        for (int n1 : nums3) {
            for (int n2 : nums4) {
                int target = -(n1 + n2);

                result += map[target];
            }
        }

        return result;
    }
};